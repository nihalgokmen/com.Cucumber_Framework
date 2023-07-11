Feature: US1004 Steplerde Parametre Kullanabilmeli

  Scenario: TC08 Amazon Nutella Testi

    Given Kullanici "amazonUrl" anasayfaya gider
    When "Nutella" icin arama yapar
    Then Arama sonuclarinin "Nutella" icerdigini test eder
    And 3 saniye bekler
    And Sayfayi kapatir

    @regression @ss
  Scenario: TC02 Amazon Java Testi

    Given Kullanici "amazonUrl" anasayfaya gider
    When "Java" icin arama yapar
    Then Arama sonuclarinin "Java" icerdigini test eder
    And 3 saniye bekler
    And Sayfayi kapatir

  Scenario: TC03 Amazon Samsung Testi

    Given Kullanici Amazon anasayfaya gider
    When Samsung icin arama yapar
    Then Arama sonuclarinin Samsung icerdigini test eder
    And Sayfayi kapatir