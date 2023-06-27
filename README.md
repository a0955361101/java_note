安裝java [oracle](https://www.oracle.com/java/technologies/java-se-glance.html)

windows 設置 :

1. windows 鍵 + R 輸入 sysdm.cpl
2. 選進階 -> 環境變數 -> 在系統變數那 點擊新增
3. 變數名稱 JAVA_HOME 變數值為安裝的路徑,未更改的情況下應該會是C:\Program Files\Java\jdk-所安裝的 jdk 版本
4. 接下來編輯系統變數裡面的 Path 在 Path 最下面新增 %JAVA_HOME%\bin
5. 打開 cmd 輸入 ava -version 如果順利顯示 "javac 版本號",表示 JDK 已正確的設定完成
