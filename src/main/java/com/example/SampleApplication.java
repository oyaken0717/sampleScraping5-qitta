package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		
//		//try-catch文が必要
//        try {
//
//            //Document A = Jsoup.connect("url").get(); urlにスクレイピング対象
//            Document doc = Jsoup.connect("https://www.yahoo.co.jp/").get();
//
//            //Elements B = A.select("タグ"); この形でソースに含まれるタグで指定された範囲を書き出す。
//            Elements elm = doc.select("title");
//
//            //拡張for文
//            for(Element elms : elm) {
//                String title = elms.text();
//                System.out.println(title); //結果　Yahoo!JAPAN
//            }
//
//            //例外処理
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
	
//		//try-catch文が必要
//	    try {
//
//	        //Document A = Jsoup.connect("url").get(); urlにスクレイピング対象
//	        Document doc = Jsoup.connect("http://archaeology.jp/learning/university/2018kougiichiran/#").get();
//
//	        //Elements B = A.select("タグ"); この形でソースに含まれるタグで指定された範囲を書き出す。
////	        Elements elm = doc.select("tbody");
//	        Elements elm = doc.select("tbody tr");
//
//	        //拡張for文
//	        for(Element elms : elm) {
//	            String title = elms.text();
//	            System.out.println(title);
//	        }
//
//	        //例外処理
//	    }catch(IOException e) {
//	        e.printStackTrace();
//	    }	
		
	}

}
