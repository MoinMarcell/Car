# Aufgabe Car

Erstelle eine Klasse ```Car``` mit den folgenden Eigenschaften:
- Name des Herstellers,
- Anzahl der Reifen,
- hat eine TÜV Plakette

Erstelle eine Klasse ```CarRepository``` mit einer Liste von Cars und den Methoden:
- addCar(Car car), die das Auto zu der Liste hinzufügt.
- getCars(), gibt die ganze Liste an Autos zurück.

Erstelle eine Klasse ```CarService``` mit den Methoden:
- addCar(Car car), ruft die addCar Methode des Repositorys auf,
- getCars(), ruft die getCars Methode vom Repository auf.

Erstelle einen ```CarController```
- Schreibe einen Post-Entpunkt der im Body ein Car entgegen nimmt und die addCar() Methode vom CarService aufruft.
- Schreibe einen Get-Endpunkt der die getCar Methode vom CarService aufruft und dann eine Liste von allen Autos zurückgibt.

# Aufgabe Car Bonus

Füge einen Delete-Endpunkt hinzu um ein zuvor hinzugefügtes `Car` wieder zu entfernen.

```DELETE /api/car/{id}```

Füge einen Put-Endpunkt hinzu um ein bereits hinzugefügtes `Car zu verändern. 
Hier soll im Body des Request das veränderte Objekt mitgeschickt werden.

```PUT /api/car/{id}```
