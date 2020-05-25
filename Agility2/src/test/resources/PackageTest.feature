Feature: US_000 Enregistrer les colis
  En tant que client
  Je veux être sûr que le poids de mon colis est correct en fonction des charges ajoutées
  Afin de m'assurer que le colis a été bien chargé

  Scenario Outline: calcul du poids du colis
    Given le chargement d'un colis <pack1> avec un poids initial de 0.1
    When le client charge le colis avec une charge <charge1>
    Then le poids du colis <weight1> sera automatiquement calculé en ajoutant la charge <charge1>

    Examples:
      |pack1 |charge1|weight1|
      |colis1|0.0    |0.1    |
      |colis2|1.9    |2.0    |

