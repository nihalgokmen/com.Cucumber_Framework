Feature: US1008 Toplu Kullanici listesi Ile Negatif Login Testi

  @qd
  Scenario Outline: TC14Kullanici listedeki kullanici bilgileri ile giris yapilmadigini test eder

    Given Kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine click yapar
    And user email olarak "<email>"