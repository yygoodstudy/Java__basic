package com.yy.concurrent;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * 多线程下载文件
 *
 * @date 2024/4/17
 */
public class FileDownloadApp {

    private static List<String> filesPath = new ArrayList<>();

    public static void main(String[] args) {
//        testLoopOutAllFileName("D:\\CF");
//        System.out.println("--------------------------");
//        System.out.println("所有的文件路径：" + filesPath);

        // URL输入有问题，导致下载失败~~~！！！！
        Thread thread = new Thread(new DownloadTask("https://magnet:?xt=urn:btih:5bb7c6e4bfd8590e5a10d60db9675b0345b358cb"));
        thread.start();
        Thread thread1 = new Thread(new DownloadTask("https://thunder://QUFlZDJrOi8vfGZpbGV844CQ6auY5riFTVA055S15b2xd3d3LmRvbXA0LmNj44CR5ZKS5oCoLjIwMDIuQkQxMDgwcC7ml6Xor63kuK3lrZcubXA0fDI2NjczNDY5NTh8OWQ4ZWU3NDI3NzQ2ZjBiNTE4YzRkNGY2ZDE0OTBiYTZ8L1pa"));
        thread1.start();
    }

    static class DownloadTask implements Runnable {
        private final String fileURL;

        public DownloadTask(String fileURL) {
            this.fileURL = fileURL;
        }


        @Override
        public void run() {
            System.out.println("Downloading from " + fileURL);
            String fileBaseName = fileURL.substring(fileURL.lastIndexOf('/') + 1);
            try {
                URL url = new URL(fileURL);
                String localFileName = System.getProperty("java.io.tmpdir")
                        + "/viscent-"
                        + fileBaseName;
                System.out.println("Saving to: " + localFileName);
                downloadFile(url, new FileOutputStream(localFileName), 1024);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Done downloading from " + fileURL);
        }


        // 从指定的URL下载文件，并将其保存到指定的输出流中
        private void downloadFile(URL url, OutputStream outputStream, int bufSize)
                throws MalformedURLException, IOException {
            // 建立HTTP连接
            final HttpURLConnection httpConn = (HttpURLConnection) url
                    .openConnection();
            httpConn.setRequestMethod("GET");
            ReadableByteChannel inChannel;
            WritableByteChannel outChannel;
            try {
                // 获取HTTP响应码
                int responseCode = httpConn.getResponseCode();
                // HTTP响应非正常:响应码不为2开头
                if (2 != responseCode / 100) {
                    throw new IOException("Error: HTTP " + responseCode);
                }

                if (0 == httpConn.getContentLength()) {
                    System.out.println("Nothing to be downloaded " + fileURL);
                    return;
                }
                inChannel = Channels
                        .newChannel(new BufferedInputStream(httpConn.getInputStream()));
                outChannel = Channels
                        .newChannel(new BufferedOutputStream(outputStream));
                ByteBuffer buf = ByteBuffer.allocate(bufSize);
                while (-1 != inChannel.read(buf)) {
                    buf.flip();
                    outChannel.write(buf);
                    buf.clear();
                }
            } finally {
                // 关闭指定的Channel以及HttpURLConnection
//                Tools.silentClose(inChannel, outChannel);
                httpConn.disconnect();
            }
        }// downloadFile结束

    }// FileDownloader结束


    /**
     * 保存并打印所有的文件名，及路径
     *
     * @param testFileDir
     */
    private static void testLoopOutAllFileName(String testFileDir) {
        if (testFileDir == null) {
            // 因为new File(null)会空指针异常,所以要判断下
            return;
        }
        File[] testFile = new File(testFileDir).listFiles();
        if (testFile == null) {
            return;
        }

        for (File file : testFile) {
            if (file.isFile()) {
                System.out.println(file.getName());
                filesPath.add(file.getPath());
            } else if (file.isDirectory()) {
                System.out.println("-------this is a directory, and its files are as follows:-------");
                testLoopOutAllFileName(file.getPath());
            } else {
                System.out.println("文件读入有误！");
            }
        }
    }
}
