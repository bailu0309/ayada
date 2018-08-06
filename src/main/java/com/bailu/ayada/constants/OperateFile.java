package com.bailu.ayada.constants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.GregorianCalendar;

public class OperateFile {
    public static void dowloadFile(File file, String filename, HttpServletResponse response) throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            long fileLength = file.length();
            response.setContentType("application/x-msdownload;");
            filename = response.encodeURL(new String(filename.getBytes(), "ISO8859_1"));// 转码
            response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
            response.setHeader("Content-Length", String.valueOf(fileLength));
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                bis.close();
            }
            if (bos != null) {
                bos.close();
            }
        }
    }

    public static String[] delMkFileYesterday(String excelTemp, HttpServletRequest request) {
        GregorianCalendar gc = new GregorianCalendar();
        int cday = gc.getTime().getDate();
        /**
         * 删除前一天的临时文件
         */
        gc.add(GregorianCalendar.DATE, -1);
        int day = gc.getTime().getDate();
        String p = excelTemp + "/" + day;
        String path = request.getSession().getServletContext().getRealPath("/") + p + File.separator;
        File temp = new File(path);
        if (temp.exists()) {
            String[] tempList = temp.list();
            File tempx = null;
            for (int i = 0; i < tempList.length; i++) {
                tempx = new File(path + File.separator + tempList[i]);
                tempx.delete();
            }
            temp.delete();
        }
        /**
         * 判断当前文件夹
         */
        String local = excelTemp + "/" + cday;
        path = request.getSession().getServletContext().getRealPath("/") + local + File.separator;
        File temp_ = new File(path);
        if (!temp_.exists()) {
            temp_.mkdirs();
        }
        String[] s = new String[]{path, local};
        return s;
    }
}
