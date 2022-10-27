package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static ArrayList<Product> productlist = new ArrayList<Product>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("\n제품입출력 관리 및 조회");
			System.out.println("\n[1] 제품추가  [2] 제품삭제  [3] 제품조회  [4] 전체제품조회  [5] 제품수정  [0] 종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택 : ");

			int selectNum = Integer.parseInt(sc.next());

			switch (selectNum) {
			case 1:
				addProduct();
				break;
			case 2:
				deleteProduct();
				break;
			case 3:
				searchProduct();
				break;
			case 4:
				allProduct();
				break;
			case 5:
				reviseProduct();
				break;
			case 0:
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(0);

			default:
				// run = false;
				System.out.println("잘못 입력하셨습니다. 다시입력하세요.");
				break;

			}
		}

	}

	// 제품추가
	private static void addProduct() {
		System.out.print("제품이름 :");
		String name = sc.next();
		System.out.print("제품가격 :");
		int price = sc.nextInt();
		System.out.print("제품종류 :");
		String type = sc.next();
		sc.nextLine();
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		p.setType(type);
		productlist.add(p);
		System.out.println("추가 되었습니다.");
		// System.out.println(productlist.size());
	}

	// 제품삭제
	private static void deleteProduct() {
		System.out.print("제품이름 :");
		String name = sc.next();
		boolean nResult = false;
		for (int i = 0; i < productlist.size(); i++) {
			Product p = productlist.get(i);
			if (p.getName().equals(name)) {
				nResult = true;
				productlist.remove(i);
				System.out.println("삭제되었습니다");
				break;
			}
		}
		if (!nResult) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	// 제품조회
	private static void searchProduct() {
		System.out.print("제품이름 :");
		String name = sc.next();
		boolean nResult = false;
		for (int i = 0; i < productlist.size(); i++) {
			Product p = productlist.get(i);
			if (p.getName().equals(name)) {
				nResult = true;
				System.out.println("이름 :" + p.getName() + " | 가격 : " + p.getPrice() + " | 종류 : " + p.getType());
				break;
			}
		}
		if (!nResult) {
			System.out.println("검색결과가 없습니다.");
		}

	}

	// 전체제품조회
	private static void allProduct() {

		System.out.println("보유 제품:" + productlist.size());
		for (int i = 0; i < productlist.size(); i++) {
			System.out.println("======================================");
			System.out.println("제품 이름 : " + productlist.get(i).getName());
			System.out.println("제품 가격 : " + productlist.get(i).getPrice());
			System.out.println("제품 종류 : " + productlist.get(i).getType());
			System.out.println("======================================\n");
		}

		System.out.println("초기메뉴 이동 : [b]\t 프로그램 종료:[0]");
		String temp = sc.next();
		// equalsIgnoreCase : 대소문자 구분 x
		if (temp.equalsIgnoreCase("b")) {
			return;
		} else if (temp.equals("0")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}

		// System.out.println();
		// for (Product product : productlist) {
		// System.out.println(product.getName());
		// System.out.println(product.getPrice());
		// System.out.println(product.getType());

	}

	// 제품수정
	private static void reviseProduct() {
		while (true) {
			System.out.println("수정 할 제품의 이름을 입력해주세요");
			String temp = sc.next();
			int cnt = 0;
			for (int i = 0; i < productlist.size(); i++) {
				if (temp.equals(productlist.get(i).getName())) {
					System.out.println("새로운 이름 입력: ");
					productlist.get(i).setName(sc.next());
					System.out.println("새로운 가격 입력: ");
					productlist.get(i).setPrice(sc.nextInt());
					System.out.println("새로운 종류 입력: ");
					productlist.get(i).setType(sc.next());
					++cnt;
					System.out.println("제품 수정 완료");
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("해당 제품이 존재하지않습니다. 제품이름을 다시 입력하세요.");

			} else {
				break;
			}
		}

//		String name;
//		int price;
//		String type;
//
//		System.out.println();
//		System.out.print("수정할 항목의 이름을 입력하세요\n");
//		name = sc.next();
//		for (int i = 0; i < productlist.size(); i++) {
//			if (name.equals(productlist.get(i).getName())) {
//
//				System.out.println("수정하실 항목을 선택하세요.[1]제품이름  [2]제품가격  [3]제품종류");
//
//				int list = sc.nextInt();
//
//				switch (list) {
//				case 1:
//					System.out.print("이름을 새로 입력하세요.");
//					name = sc.next();
//					productlist.get(i).setName(name);
//					break;
//				case 2:
//					System.out.print("가격을 새로 입력하세요.");
//					price = sc.nextInt();
//					productlist.get(i).setPrice(price);
//					break;
//				case 3:
//					System.out.print("종류를 새로 입력하세요.");
//					type = sc.next();
//					productlist.get(i).setType(type);
//					break;
//				}
//				System.out.println("수정되었습니다");
//			} else {
//				System.out.println("잘못된 정보입니다.");
//			}
//			break;
//
//		}

	}

}// end class
