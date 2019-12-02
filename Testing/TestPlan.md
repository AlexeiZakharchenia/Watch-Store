# План тестирования
---

# Содержание
1 [Введение](#introduction)  
2 [Объект тестирования](#items)  
3 [Атрибуты качества](#quality)  
4 [Риски](#risk)  
5 [Аспекты тестирования](#features)  
6 [Подходы к тестированию](#approach)  
7 [Представление результатов](#pass)  
8 [Выводы](#conclusion)

<a name="introduction"/>

## Введение

Данный документ описывает план тестирования приложения ["Wannait"](https://github.com/L1ttl3S1st3r/wannait). Документ предназначен для людей, выполняющих тестирование данного проекта (тестировщиков). Цель тестирования - проверка соответствия реального поведения программы проекта и ее ожидаемого поведения. Ожидаемые результаты формируются на основе [требований](https://github.com/L1ttl3S1st3r/wannait/blob/master/Documents/Requirements/Requirements%20Document.md).

<a name="items"/>

## Объект тестирования

В качестве объектов тестирования можно выделить программные модули, отвечающие за выполнение функциональных требований, а также отображения основных частей интерфейса пользователя:

* модуль работы пользователя с расписанием на день;
* модуль работы пользователя с расписанием на неделю;
* модуль, отвечающий за вывод информации о приложении пользователю (справочная информация);
* модуль для реализации переходов между разделами приложения. 

<a name="quality"/>

## Атрибуты качества

1. Функциональность:
    - функциональная полнота: приложение должно выполнять все заявленные функции;
    - функциональная корректность: приложение должно выполнять все заявленные функции корректно;
    - функциональная целесообразность: отсутствуют не заявленные функции, которые бы мешали приложению выполнять первоначально поставленные задачи
2. Удобство использования:
    - эстетика пользовательского интерфейса: использование фрйемворка Django, понятный и плавный интерфейс;
    - актуальность: обновление данных, например, добавление недавно вышедших фильмов к рекомендациям;

<a name="risk"/>

## Риски

В данном случае к рискам можно отнести:
* обрыв соединения с базами данных kaggle;
* обрыв интернет-соединения при выполниении теста в котором оно предусмотрено;
* при запуске приложения в среде версии меньше указанной в требованиях приложение может работать некорректно.

<a name="features"/>

## Аспекты тестирования

В ходе тестирования планируется проверить реализацию основных функций приложения. Аспекты, подвергаемые тестированию: 
* запуск приложения;
* переход между разделами приложения (день/неделя);
* просмотр расписания на день;
* просмотр расписания на неделю;
* добавление группы с расписанием;
* изменение расписание при выборе другой подгруппы.

Примечание: при тестировании всех аспектов кроме первого предполагается наличие Интернет-соединения, в противном случае данные в приложении будут загружены из кэша, что может привести к некорректному результату теста.

### Запуск приложения
Этот вариант использования небходимо протестировать на:
* запуск приложения без подключения к интернету;
* запуск приложения с подключением к интернету;


### 
Этот вариант использования небходимо протестировать на:
* 
* 

### 
Этот вариант использования небходимо протестировать на:
* 
* 

### 
Этот вариант использования небходимо протестировать на:
* 
* 

### 
Этот вариант использования небходимо протестировать на:
* 
* 
* 

### 
Этот вариант использования небходимо протестировать на:
* 
* 

## Нефункциональные требования:
* минимальное время простоя;
* минимальное количество элементов графического интерфейса;
* плавный интерфейс - отсутствие задержек во время использования приложения;
* количество действий для выполнения функции минимально:
* минимальные задержки во время выполнения основных операций.

<a name="approach"/>

## Подходы к тестированию

При тестировании будет использован ручной подход.

<a name="pass"/>

## Представление результатов

Результаты представлены  в документе ["Результаты тестирования"](https://github.com/AlexeiZakharchenia/Watch-Store/blob/master/Testing/TestResults.md).

<a name="conclusion"/>

## Выводы

Данный тестовый план позволяет протестировать основной функционал приложения. Успешное прохождение всех тестов не гарантирует полной работоспособности на всех версиях платформ и архитектурах, однако позволяет полагать, что данное программное обеспечение работает корректно.