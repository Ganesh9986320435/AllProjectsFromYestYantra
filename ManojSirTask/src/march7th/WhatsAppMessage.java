package march7th;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class WhatsAppMessage {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter message");
		String msg=scanner.nextLine();
		System.out.println("enter times");
		int size=scanner.nextInt();
		StringSelection stringSelection=new StringSelection(msg);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		Thread.sleep(5000);
		Robot robot=new Robot();
		for(int i=0;i<size;i++) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(100);
		}
		
	}
}
