// 每個 java 程序都有一個 class 必須與文件名稱匹配,並每個個程序都必須包含 main() 方法
public class Main {
    public static void main(String[] args){
        // System 內置的 java 類
        // println() 印出值 會有換行的效果
        System.out.println("Hello World");
        System.out.println("I am learning Java");
        System.out.println("It is awesome");
        System.out.println(87);
        System.out.println(1 + 1);
        System.out.println(1 * 2);
        // print() 印出值 但不會換行
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");

        // 變數
        // String - "content"
        // int - 存整數,不帶小數. 例: 123 or -123
        // float - 存浮點數,帶小數. 例: 3.21 or -3.21
        // char - 存單個字符 例: a 或 B 需用單引號括起來
        // boolean - true 或 false 

        // 聲明變數的方法
        String variableName = "value";
        System.out.println(variableName);
    }
}

// 如何運行代碼
// cmd 輸入 javac Main.java
// 這將編譯代碼 如果沒有錯誤的話
// 輸入 java Main 來運行這個文件
// output 為 Hello World



