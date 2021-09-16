#Assignemnt 1

# **COMPILER** vs **INTERPRETER**, a good example taken from a textbook "AA compiler is like a human translator who translates an entire book from one language to another, producing a new book in the second language. An interpreter is more like a human interpreter who translates a speech at the United Nations from one language to another at the same time that the speech is being given."

# **JVM** bilgisayarın Java kodlarını çalıştırabilmesi için kullanılan arayüzdür. Makine dili direkt olarak CPU'da çalıştırılabilir ancak Java, C++, Phyton gibi yüksek seviye programlama dillerinin **Compiler** aracılığı ile makine diline çevrilmesi gerekmektedir. Ancak bu her işletim sistemi için o sisteme ait çevirilmeye ihtiyaç duyar. Bunun yanı sıra, Java "JVM" adı verilen bir arayüz kullanır ve Java ile yazılmış olan java dilini **"JAVA BYTECODE"** lara çevirir. Bu çevirilen bytecodelar herhangi bir işletim sisteminde rahatlıkla interpreter aracılığı ile çevrilip çalıştırılabilir, değiştirilebilir yazılabilir. Sıralı ve düzgün.

# ** Stack Memory vs Heap Memory**

* **Stack Memory** bir fonksiyon çağırıldığında atanan değişkenleri sayesinde sıralı hafızada ayrılacak yer için belirlenmiş alandır. Geçici bir saklama yöntemidir ve çağırılma bittiğinde, fonksiyon çalıştığında kendisi için stack'te ayrılan yer otomatik olarak silinir. int, double vs. gibi değişkenler atadığımızda stackte her bir değişken için yer ayrılır ve görevleri bittiğinde bu yer silinir. Görece alan daha küçük.

* **Heap Memory** Programda herhangi bir obje tanımlandığında heap memory'de o obje için bir yer  ayırılır ve stack gibi geçici, silinebilir bir veri değildir. Program çalıştığı sürece ayrılan yer korunur. Ancak garbage collector gibi bir araç ile kullanılmayan ögelerin temizlenmesi sağlanabilir. Görece alan daha büyük. Düzenli değil, karşık. 

# **JRE** JVM içeren ve gerekli kütüphaneleri bu JVM'ye sağlayan arayüz. JRE = JVM + Java Kütüphaneleri, JDK = JRE + Compiler + debugger 

#Assignment2
# **Java 17 ile Gelen Yeni Özellikler**

