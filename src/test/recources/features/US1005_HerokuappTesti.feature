Feature: US1005 Kullanici Butonlari Test Eder

  Scenario: TC11 Kullanici butonlari ve cikan yazilari test eder


  Yeni bir test methodu olusturalim
  https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

    Given Kullanici "herokuUrl" anasayfaya gider
    Then Add Element butona basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test edin
    And Sayfayi kapatir