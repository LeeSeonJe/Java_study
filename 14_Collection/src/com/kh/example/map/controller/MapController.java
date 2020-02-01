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
		// put(K key, V value) : Ű�� �� �߰�, ���� �� value ��ȯ

		map.put("�����", new Snack("§��", 1500));
		map.put("������", new Snack("�ܸ�", 1500));
		map.put("��������Ĩ", new Snack("§��", 2500));
		map.put("��ҹ�", new Snack("����Ѹ�", 1000));
		System.out.println(map);
		// ������� Ű = ������ �ڵ����� ��������� ����
		// ������ �������� �ʰ� value�� �ߺ����
		map.put("�����", new Snack("�ſ��", 1500));
		System.out.println(map);
		// Ű���� �������� ���߿� �� Ű���� value������ �ٲ�

		// ===============================================================================

		// Ű �Ǵ� ���� �ִ��� ������ Ȯ���ϴ� �޼ҵ�
		// containsKey(Object key) : key�� ������ true
		// containsValue(Object value) : value�� ������ true ��ȯ
		System.out.println(map.containsKey("�����"));
		System.out.println(map.containsValue(new Snack("§��", 2500)));

		// ===============================================================================

		// get(Object key) : Ű�� �� ��ȯ
		System.out.println(map.get("�����"));
		System.out.println(map.get("Ȩ����"));

		// ===============================================================================

		// 1. values() : ��� value�� Collection�� ��� ��ȯ
		System.out.println(map.values());

		// 2. keySet() : ��� key�� set�� ��� ��ȯ
		Set<String> set1 = map.keySet(); // Ű�� set����̿��� Set�� map.keySet()�� �ؼ� ��Ƶд�.
		System.out.println(set1);
		Iterator<String> it = set1.iterator(); // �÷��ǿ� ����� ��Ҹ� �����ϴ� �������̽��� Iterator�� ����Ѵ�.

		while (it.hasNext()) { // �������� �ִ��� Ȯ��
			String key = it.next(); // Ű���� �����
			System.out.println("Ű : " + key + ", �� : " + map.get(key)/* Ű���� ���� value�� ������ */);
		}

		// 3. entrySet() : ��� entry��ü (Ű+���� ��)�� set�� ��� ��ȯ
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();

		while (it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println("Ű : " + entry.getKey() + ", �� : " + entry.getValue());
		}

		// ===============================================================================

		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map); // ���� �� �ִ°� map�� ����ִ´�.
		System.out.println(map2); // String�� comparable�� �����Ǿ� �ֱ� ������ ���ı����� ������ �־� ������ �Ǽ� ���´�.

	}

	public void doProperties() {
		Properties prop = new Properties();
		// put�� hashtable���� �������� ������ ����ϸ� �ȵȴ�.
		prop.setProperty("ä��", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "����");
		prop.setProperty("ä��", "�Ǹ�");
		System.out.println(prop);

		System.out.println(prop.getProperty("ä��"));
		System.out.println(prop.getProperty("ä��", "����")); // Ű���� �����ϸ� ���� value���� �����´�.
		System.out.println(prop.getProperty("�߰�", "����")); // Ű���� �������� ������ �ڿ� ���� ����Ѵ�.
		System.out.println(prop.getProperty("�߰�"));
	}

	public void fileSave() {
//		try (FileOutputStream fos = new FileOutputStream("test.properties");) { // properties ����
		try (FileOutputStream fos = new FileOutputStream("test.xml");) { // XML ����
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practice");
			prop.setProperty("language", "kor");

			// store(OutputStream os, String comments)
			// Store(Writer writer, String comments)
			// os(�Ǵ� Writer)�� prop����(����Ʈ �Ǵ� ���� ��������), comments�� �ּ����� ����

//			prop.store(fos, "Properties Test File");

			// storeToXML(OutputStream os, String comment)
			// ����� ������ ����Ʈ ��Ʈ������ xml ��� ����

			prop.storeToXML(fos, "storeToXML Test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
//		try (FileInputStream fis = new FileInputStream("test.properties");) { // properties �о����
		try (FileInputStream fis = new FileInputStream("test.xml");) { // XML �о����
			Properties prop = new Properties();
			// ���Ͽ��� �о�� �����ϴ� ������Ƽ

			// load(InputStream is) : ����Ʈ��Ʈ������ ����� ������ ������ �о�ͼ� Properties��ü�� ����
			// load(Reader reader) : ���� ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
//			prop.load(fis);
//			System.out.println(prop);

			// XML �о����
			// loadFromXML(InputStream is) : ����Ʈ��Ʈ������ ����� xml������ ������ �о�ͼ� properties ��ü�� ����
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
