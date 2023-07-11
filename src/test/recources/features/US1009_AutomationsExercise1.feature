Feature: US1009 Kullanici automations exercise sayfasinda yeni kullanici olurturur

  @ae
  Scenario: TC15 Kullanici kendi biligleriyle yeni kullanici olusturabilmeli


    Given Kullanici "aeUrl" anasayfaya gider
    And user sign up linkine tiklar
    And user Create an account bölümüne name ve email adresi girer
    And signUp butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu test edin