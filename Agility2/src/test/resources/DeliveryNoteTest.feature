Feature: US_001 Donner les prix des colis
  En tant que client
  Je veux être sûr de payer le prix correspondant au poids de mon colis
  Afin de m'assurer que le prix  à payer est justifié

  Scenario Outline: calcul du prix du colis
    Given Un bon de livraison peut contenir plusieurs colis <packageList1>
    When le client pèse l'ensemble de colis de poids total <totalWeight1>
    Then le prix du colis <price1> sera automatiquement calculé

    Examples:
      |packageList1|totalWeight1|price1 |
      |colis1      |0.1         |1.05   |
      |colis2      |2.0         |21.0   |

