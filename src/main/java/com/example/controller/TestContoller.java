package com.example.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TestContoller {

	@RequestMapping("")
	public String toStart() {
		
		//try-catch文が必要
	    try {

//■ HTML全体を取得	    	
	    	String url = "https://paiza.jp/career/job_offers/dev_language/Java";
	        Document doc = Jsoup.connect(url).get();

//■ 社名を取得
	        //■ Elements B = A.select("タグ"); この形でソースに含まれるタグで指定された範囲を書き出す。Elements:HTMLの要素を表すクラス
	        Elements elm = doc.select("h4 a"); //■select("タグ") HTMLのテキストを取得する。 attr("タグ") 属性の値を取得する

//■ 給与を取得	        
	        Elements elms_salary = doc.select("table tbody tr td strong");
	        
//	        for(Element elm_salary : elms_salary) {
//            String salary = elm_salary.text();
//            System.out.println(salary);
//          }
	        
	        for (int i = 0; i < elms_salary.size(); i++) {
//■ 今回聞きたい所	        	
				String salary = elms_salary[i].text();
				System.out.println(salary);
			}
	        
	    //例外処理
	    }catch(IOException e) {
	        e.printStackTrace();
	    }	

		return "start";
	}

	@RequestMapping("/finish")
	public String finish() {
		return "finish";
	}
}
