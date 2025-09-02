MyClassList Projesi

Proje Hakkında

MyClassList projesi, Java’da dinamik ve generic bir liste sınıfı oluşturmayı amaçlar.
Bu sınıf, ArrayList benzeri işlevleri kendi yöntemlerimizle gerçekleştirmek için tasarlanmıştır. Java Collection sınıfları kullanılmamıştır.

Özellikler

Generic Destek: Liste herhangi bir veri tipini destekler.

Dinamik Boyut: Liste dolduğunda kapasite otomatik olarak 2 katına çıkar.

Temel Liste İşlemleri:

add(T data) – Eleman ekleme

get(int index) – Belirli indisteki elemanı alma

remove(int index) – Belirli indisteki elemanı silme

set(int index, T data) – Belirli indisteki elemanı güncelleme

size() – Liste boyutunu alma

getCapacity() – Dizinin kapasitesini alma

isEmpty() – Listenin boş olup olmadığını kontrol etme

Arama ve Kontrol:

indexOf(T data) – İlk geçen elemanın indisini bulma

lastIndexOf(T data) – Son geçen elemanın indisini bulma

contains(T data) – Elemanın listede olup olmadığını kontrol etme

Alt Liste ve Dizi:

sublist(int start, int finish) – Belirtilen aralıktaki elemanlardan alt liste oluşturma

toArray(T[] a) – Listeyi diziye dönüştürme

Listeyi Temizleme:

clear() – Listeyi tamamen boşaltma

Kurulum ve Çalıştırma

Proje klasörünü oluşturun:

ProjeKlasoru/

└── ClassList/

├── MyClassList.java

└── Main.java

