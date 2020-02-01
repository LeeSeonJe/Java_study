package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {

	public void doMap() {
		Map<String, Snack> map = new HashMap<String, Snack>();
		// put(K key, V value) : 키와 값 추가, 성공 시 value 반환

		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 1500));
		map.put("포테이토칩", new Snack("짠맛", 2500));
		map.put("고소미", new Snack("고소한맛", 1000));
		System.out.println(map);
		// 결과값은 키 = 값으로 자동으로 만들어져서 나옴
		// 순서는 유지되지 않고 value는 중복허용
		map.put("새우깡", new Snack("매운맛", 1500));
		System.out.println(map);
		// 키값이 같을때는 나중에 들어간 키값의 value값으로 바뀜

		// ===============================================================================

		// 키 또는 값이 있는지 없는지 확인하는 메소드
		// containsKey(Object key) : key가 있으면 true
		// containsValue(Object value) : value가 있으면 true 반환
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 2500)));

		// ===============================================================================

		// get(Object key) : 키의 값 반환
		System.out.println(map.get("새우깡"));
		System.out.println(map.get("홈런볼"));

		// ===============================================================================

		// 1. values() : 모든 value를 Collection에 담아 반환
		System.out.println(map.values());

		// 2. keySet() : 모든 key를 set에 담아 반환
		Set<String> set1 = map.keySet(); // 키는 set방식이여서 Set에 map.keySet()을 해서 담아둔다.
		System.out.println(set1);
		Iterator<String> it = set1.iterator(); // 컬렉션에 저장된 요소를 접근하는 인터페이스인 Iterator을 사용한다.

		while (it.hasNext()) { // 다음값이 있는지 확인
			String key = it.next(); // 키값을 담아줌
			System.out.println("키 : " + key + ", 값 : " + map.get(key)/* 키값을 통해 value를 가져옴 */);
		}

		// 3. entrySet() : 모든 entry객체 (키+값의 쌍)를 set에 담아 반환
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();

		while (it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
		}

		// ===============================================================================

		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map); // 전부 다 넣는것 map을 집어넣는다.
		System.out.println(map2); // String에 comparable이 구현되어 있기 때문에 정렬기준이 정해져 있어 정렬이 되서 나온다.

	}

	public void doProperties() {
		Properties prop = new Properties();
		// put은 hashtable에서 가져오기 때문에 사용하면 안된다.
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망");
		System.out.println(prop);

		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("채소", "땅콩")); // 키값이 존재하면 원래 value값을 가져온다.
		System.out.println(prop.getProperty("견과", "땅콩")); // 키값이 존재하지 않으면 뒤에 값을 출력한다.
		System.out.println(prop.getProperty("견과"));
	}

	public void fileSave() {
//		try (FileOutputStream fos = new FileOutputStream("test.properties");) { // properties 저장
		try (FileOutputStream fos = new FileOutputStream("test.xml");) { // XML 저장
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("language", "kor");

			// store(OutputStream os, String comments)
			// Store(Writer writer, String comments)
			// os(또는 Writer)에 prop저장(바이트 또는 문자 형식으로), comments는 주석으로 저장

//			prop.store(fos, "Properties Test File");

			// storeToXML(OutputStream os, String comment)
			// 저장된 정보를 바이트 스트림으로 xml 출력 저장

			prop.storeToXML(fos, "storeToXML Test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
//		try (FileInputStream fis = new FileInputStream("test.properties");) { // properties 읽어오기
		try (FileInputStream fis = new FileInputStream("test.xml");) { // XML 읽어오기
			Properties prop = new Properties();
			// 파일에서 읽어와 저장하는 프로퍼티

			// load(InputStream is) : 바이트스트림으로 저장된 파일의 내용을 읽어와서 Properties객체에 저장
			// load(Reader reader) : 문자 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
//			prop.load(fis);
//			System.out.println(prop);

			// XML 읽어오기
			// loadFromXML(InputStream is) : 바이트스트림으로 저장된 xml파일의 내용을 읽어와서 properties 객체에 저장
			prop.loadFromXML(fis);
			System.out.println(prop);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test() {
		try (FileOutputStream fos = new FileOutputStream("test2.txt");) {
			Properties prop = new Properties();
			prop.setProperty("test", "t");
			
			prop.store(fos, "ggg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
