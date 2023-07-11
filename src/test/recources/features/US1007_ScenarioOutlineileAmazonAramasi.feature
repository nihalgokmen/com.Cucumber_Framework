Feature: US1007 Amazon'da Coklu Arama

  Scenario Outline: TC13 Kullanici Amazon'da coklu arama yapabilmeli

    Given Kullanici Amazon anasayfaya gider
    When "<aranacakUrun>" icin arama yapar
    Then Arama sonuclarinin "<aranacakUrun>" icerdigini test eder
    And Sayfayi kapatir

    Examples:
      | aranacakUrun |
      | Java         |
      | Phyton       |
      | Cucumber     |
      | Aplle        |