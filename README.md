Bu proje, farklı makinelerde farklı sürelerde işlerin tamamlandığı ve makineler arası geçiş maliyetlerinin bulunduğu bir üretim hattında, işlerin minimum toplam sürede tamamlanmasını amaçlayan bir dinamik programlama çözümüdür.


Problem Tanımı:


Bir üretim hattında n adet iş sıralı şekilde yapılmak zorundadır.
Her iş, m farklı makinede tamamlanabilir ve her makinede işlem süresi farklıdır.
Ayrıca, bir işten sonra başka bir makinede devam edilirse bir geçiş maliyeti (setup cost) oluşur.

Amaç, tüm işleri sırasıyla tamamlamak için minimum toplam süreyi bulmaktır.

Kullanılan Yöntem:


Bu problem, klasik matris zinciri çarpımı problemini andırır.
Dinamik programlama (DP) yaklaşımıyla çözülmüştür:

dp[i][j]: i'nci işin j'nci makinede yapılması durumunda o ana kadar oluşan minimum süre

Geçiş maliyetleri transition[i][j] ile modellenmiştir

Çözüm: dp[n-1][j] değerlerinin minimumu

Zaman Karmaşıklığı: O(n × m²) 



Uzay Karmaşıklığı: O(n × m)
