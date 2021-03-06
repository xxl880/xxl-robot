package com.xxl.robot.tools;

import com.xxl.robot.time.PhoneSchedule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MouseTools {
    private static final Logger log = LoggerFactory.getLogger(MouseTools.class);
    /**
     * todo 常规操作(传过来数据 点击输入并回车操作)
     *
     */
    public static void normalEvent(Robot robot, String operateData){
        try {
            //点击左边菜单标题
            robot.delay(3600);
            /*ClipboardTools.setClipboard(operateData);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            //robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
           // robot.delay(100);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
           // robot.delay(200);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
          //  robot.delay(200);
            robot.keyRelease(KeyEvent.VK_ENTER);*/
            log.info(operateData);
            Runtime.getRuntime().exec(operateData);
            robot.delay(200);
        }catch (Exception e){

        }
    }


    /**
     * todo 常规操作(传过来数据 点击输入并回车操作)
     *
     */
    public static void fastNormalEvent(Robot robot, String operateData){
        try {
            //点击左边菜单标题
            robot.delay(1200);
   /*         ClipboardTools.setClipboard(operateData);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_ENTER);*/
            log.info(operateData);
            Runtime.getRuntime().exec(operateData);
            robot.delay(200);
        }catch (Exception e){

        }
    }



    /**
     * 鼠标单击（左击）,要双击就连续调用
     *
     * @param r
     * @param x
     *      x坐标位置
     * @param y
     *      y坐标位置
     * @param delay
     *      该操作后的延迟时间
     */
    public static void clickLMouse(Robot r, int x, int y, int delay) {
        r.mouseMove(x, y);
        r.mousePress(InputEvent.BUTTON1_MASK);
        r.delay(10);
        r.mouseRelease(InputEvent.BUTTON1_MASK);
        r.delay(delay);

    }

    /**
     * 鼠标右击,要双击就连续调用
     *
     * @param r
     * @param x
     *      x坐标位置
     * @param y
     *      y坐标位置
     * @param delay
     *      该操作后的延迟时间
     */
    public static void clickRMouse(Robot r, int x, int y, int delay) {
        r.mouseMove(x, y);
        r.mousePress(InputEvent.BUTTON3_MASK);
        r.delay(10);
        r.mouseRelease(InputEvent.BUTTON3_MASK);
        r.delay(delay);

    }

    /**
     * 键盘输入（一次只能输入一个字符）
     *
     * @param r
     * @param ks
     *      键盘输入的字符数组
     * @param delay
     *      输入一个键后的延迟时间
     */
    public static void pressKeys(Robot r, int[] ks, int delay) {
        for (int i = 0; i < ks.length; i++) {
            r.keyPress(ks[i]);
            r.delay(10);
            r.keyRelease(ks[i]);
            r.delay(delay);
        }
    }

    /**
     * 复制
     *
     * @param r
     * @throws InterruptedException
     */
    void doCopy(Robot r) throws InterruptedException {
        Thread.sleep(3000);
        r.setAutoDelay(200);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_C);
    }

    /**
     * 粘贴
     *
     * @param r
     * @throws InterruptedException
     */
    void doParse(Robot r) throws InterruptedException {
        r.setAutoDelay(500);
        Thread.sleep(2000);
        r.mouseMove(300, 300);
        r.mousePress(InputEvent.BUTTON1_MASK);
        r.mouseRelease(InputEvent.BUTTON1_MASK);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
    }

    /**
     * 捕捉全屏慕
     *
     * @param r
     * @return
     */
    public Icon captureFullScreen(Robot r) {
        BufferedImage fullScreenImage = r.createScreenCapture(new Rectangle(
                Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIcon icon = new ImageIcon(fullScreenImage);
        return icon;
    }

    /**
     * 捕捉屏幕的一个矫形区域
     *
     * @param r
     * @param x
     *      x坐标位置
     * @param y
     *      y坐标位置
     * @param width
     *      矩形的宽
     * @param height
     *      矩形的高
     * @return
     */
    public Icon capturePartScreen(Robot r, int x, int y, int width, int height) {
        r.mouseMove(x, y);
        BufferedImage fullScreenImage = r.createScreenCapture(new Rectangle(
                width, height));
        ImageIcon icon = new ImageIcon(fullScreenImage);
        return icon;
    }




}
