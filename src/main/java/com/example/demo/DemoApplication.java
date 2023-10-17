package com.example.demo;

import java.io.IOException;
import java.util.Calendar;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.config.BeanConfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		// ImageUtil iu = new ImageUtil();
		// try {
		// 	iu.save("http://ggoreb.com/images/luffy.jpg");
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// }

		// ApplicationContext context =
		// new AnnotationConfigApplicationContext(BeanConfig.class);
		// Game game = (Game) context.getBean("game");
		// game.play();
		// Movie movie = (Movie) context.getBean("movie");
		// movie.play();
		// Music music = (Music) context.getBean("music");
		// music.play();
		// ImageUtil imageUtil = (ImageUtil) context.getBean("imageUtil");
		// try {
		// 	imageUtil.save("http://ggoreb.com/images/luffy.jpg");
		// } catch (IOException e) {
		// 	e.printStackTrace();
		// }
		// ((AnnotationConfigApplicationContext) context).close();



		SpringApplication.run(DemoApplication.class, args);

		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// 		"classpath:application.xml");
		// int i = (int) context.getBean("bean22");
		// System.out.println(i);

		// int i2 = new Integer("1234");

		// ApplicationContext context = new AnnotationConfigApplicationContext(
		// BeanConfig.class);
		
		// //Bean이름 규칙 => 첫글자를 소문자로
		// Bean33 bean33  = (Bean33) context.getBean("bean33");
		// System.out.println(bean33.run());




		// String s = (String) context.getBean("bean1");
		// System.out.println(s);

		// String s2 = new String("직접 Bean");
		// System.out.println(s2);

		// Random r = (Random) context.getBean("bean2");
		// System.out.println(r.nextInt());

		// Calendar c = (Calendar) context.getBean("bean3");
		// System.out.println(c.get(Calendar.DAY_OF_MONTH));

	}

}
