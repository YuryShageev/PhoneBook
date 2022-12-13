import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> phoneList = new HashMap<>();

        phoneList.put("Петрович", "+79812457643");
        phoneList.put("Михалыч", "+79835457643");
        phoneList.put("Фёдорович", "+79832497643");
        phoneList.put("Юрьевич", "+79832457343");
        phoneList.put("Саныч", "+79832457641");
        phoneList.put("Потапыч", "+79832057643");
        phoneList.put("Олегович", "+79832157643");
        phoneList.put("Евгеньевич", "+79835457643");
        phoneList.put("Максимович", "+79832857643");
        phoneList.put("Игоревич", "+79832452643");
        phoneList.put("Романовна", "+79832407643");
        phoneList.put("Владимировна", "+79892457643");
        phoneList.put("Вадимовна", "+79832851643");
        phoneList.put("Вячеславовна", "+79632457643");
        phoneList.put("Ярославовна", "+79832407603");
        phoneList.put("Кирилловна", "+79832457640");
        phoneList.put("Антоновна", "+79832457113");
        phoneList.put("Сергеевна", "+79832227643");
        phoneList.put("Патрикеевна", "+79792457643");
        phoneList.put("Александровна", "+79831407113");

        System.out.println(phoneList.get("Сергеевна"));
        System.out.println(phoneList.keySet());
    }
}
