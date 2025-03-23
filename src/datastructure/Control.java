package datastructure;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("1. 비지니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("이름을 입력하세요: ");
                    String name2 = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String phone2 = scanner.nextLine();
                    System.out.print("회사명을 입력하세요: ");
                    String company = scanner.nextLine();
                    addressBook.addContact(new BusinessContact(name2, phone2, company));
                    break;
                case "2":
                    System.out.print("이름을 입력하세요: ");
                    String nameP = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String phoneP = scanner.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String relationship = scanner.nextLine();
                    addressBook.addContact(new PersonalContact(nameP, phoneP, relationship));
                    break;
                case "3":
                    addressBook.displayContacts();
                    break;
                case "4":
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    addressBook.searchContact(searchName);
                    break;
                case "5":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("연락처가 비어있습니다.");
            }
        }
    }
}