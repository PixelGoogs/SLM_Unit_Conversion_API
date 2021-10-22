# Welcome to the SLM_Unit_Conversion_API!

https://cis.technikum-wien.at/cis/index.html
https://moodle.technikum-wien.at/my/
https://moodle.technikum-wien.at/course/view.php?id=16820

## Unit Conversion API

Wir sind ein kleines Labor in Wien. Um unseren Forschungsprozess zu verbessern, wollen wir eine digitale Schnittstelle beauftragen, die Maßeinheiten umrechnet. Um die Funktionen zu testen, soll ein Prototyp entwickelt werden, der

* Kilogramm (kg) in Gramm (g)
* Gramm (g) in Kilogramm (kg)
* Celsius (C) in Fahrenheit (F)
* Fahrenheit (F) in Celsius (C) umrechnet.

## Projekt

Ein Team (max. 3er Team) soll eine REST-based API mit Hilfe von Java Spring Boot entwickeln. Die API soll in der Lage sein, Maßeinheiten umzurechnen.

## Endpoint

`/api/convert`

API Request Beispiel

```
{
    "fromValue":  1000.0,  [required,  float] 
    "fromType":  "g",  [required,  string] 
    "toType":  "kg"  [required,  string]
}
```

## API Response Beispiel

```
{
    "valid":  true,  [boolean] 
    "result":  1.0,  [float]
    "fromValue":  1000.0,  [float] 
    "fromType":  "g",  [string]
    "toType":  "kg"  [string]
}
```

## Hinweis

`C = 5/9 * (F – 32) F = C * 9/5 + 32`

## Bonuspunkte

Wenn das Strategy Pattern richtig verwendet wurde und die API einfach erweiterbar ist, können 10 Bonuspunkte für das Semesterprojekt erarbeitet werden.

Einfach erweiterbar bedeutet

* Am bestehenden Code muss nichts verändert werden
* Es muss nur eine neue Klasse erstellt werden, die ein Interface implementiert

Hilfreiche Links:

* https://www.baeldung.com/spring-dynamic-autowire
* https://www.baeldung.com/spring-dynamic-autowire