# Java-Advanced-Features-Coding

### Vending Machine application

**Requirements**

Implement a traditional vending machine which:
* Allow user to select products - the menu is displayed in console.
* Allow user to select what coins to insert - menu is displayed in console.
* Allow user to take refund by canceling the request.
* Return selected product and remaining change if any.
* The state of the vending machine is saved in a file on the disk - a json file.
* Vending Machine has the product menu configurable - new products can be added in the json file.
* Vending Machine is configurable on what coins it accepts - new coins can be added in the json file.

#BEFORE
Test data file
```json
{
  "currency": "EUR",
  "productStock": [
    [
      {
        "cod": 101,
        "name": "Coke",
        "price": 3,
        "size": "0,5L"
      },
      10
    ],
    [
      {
        "cod": 102,
        "name": "Fanta",
        "price": 3,
        "size": "0,5L"
      },
      7
    ],
    [
      {
        "cod": 103,
        "name": "Water",
        "price": 2,
        "size": "1L"
      },
      1
    ],
    [
      {
        "cod": 104,
        "name": "Chocolate",
        "price": 5,
        "size": "100g"
      },
      4
    ]
  ],
  "coinStock": [
    [
      {
        "cod": 201,
        "value": 1
      },
      5
    ],
    [
      {
        "cod": 202,
        "value": 5
      },
      2
    ],
    [
      {
        "cod": 203,
        "value": 10
      },
      1
    ]
  ]
}
```