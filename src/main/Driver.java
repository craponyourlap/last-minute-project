package main;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.commands.Command;

public class Driver {
	static Set<Command> commands = new TreeSet<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String userdir = System.getProperty("user.dir");
		String driverPath = userdir + "/src/resources/driver/chromedriver.exe";
		String userfilePath = userdir + "/src/resources/userfile.txt";
		
		FileWriter fw = new FileWriter(userfilePath);
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		boolean flag = false;
		for (int j = 1; j <= 63; j++) {
			driver.get("https://leetcode.com/problemset/?page="+j);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			for (int i = 1; i <= 50; i++) {
				WebElement webElementProblems;
				try {
					webElementProblems = driver.findElement(By.xpath("//div[@class='border-spacing-0 overflow-auto']/div[@class='inline-block min-w-full']/div[2]/div[@class='odd:bg-layer-1 even:bg-overlay-1 dark:odd:bg-dark-layer-bg dark:even:bg-dark-fill-4']["+i+"]"));
					bw.write(webElementProblems.getText());
					bw.flush();
				} catch (Exception e) {
					flag = true;
					break;
				}
				if (flag) break;
			}
		}
		driver.close();
	}

	private static void consume(String input) {
		// TODO Auto-generated method stub
		Queue<String> q = new ArrayDeque<String>(Arrays.asList(input.split(" ")));
		while (!q.isEmpty())System.out.println(q.poll());
		
	}

}
