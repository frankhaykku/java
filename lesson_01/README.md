ООП. Первое Java приложение
===========================

Знакомство
----------

Степулёнок Денис Олегович - Stden@mail.ru

Почему Java?
------------
* http://www.tiobe.com/index.php/content/paperinfo/tpci/index.html - TIOBE Index
* http://readwrite.com/2014/01/08/in-demand-tech-skills-of-2013-java - Популярность Java

Обзор сайтов и литературы по Java и ООП
---------------------------------------

**Сайты**
* http://vk.com/java_course - группа для участников курса
* http://levelp.ru/courses/programmirovanie/java-junior-developer/ - 
курс Java Junior Developer на сайте LevelUp
* http://levelp.ru/courses/programmirovanie/basics-of-programming-java/ - 
курс "Основы программирования и алгоритмизации на языке Java" на на сайте LevelUp
* http://javarush.ru - курс Java для начинающих (http://info.javarush.ru/page/learning_plan/ - план обучения)
* http://www.intuit.ru/studies/courses/16/16/info - "Программирование на Java" курс лекций на ИНТУИТ
* http://levelp.ru/knowledge-base/ - форум на сайте LevelUp (задавать вопросы по д.з.)
* http://hashcode.ru/ - ответы на вопросы

**Книги по Java**
* Программирование на Java и C# для студента, О. Герман, Ю. Герман: http://www.bookvoed.ru/book?id=3819902
* Head First Java (Java, A Beginner's Guide).
* Java. The Complete Reference. 8th Edition / Java. Полное руководство. 8-е издание - http://rutracker.org/forum/viewtopic.php?t=4164907 - 
* Test Driven Development (Kent Beck)
* Thinking in Java (Философия Java) Брюс Эккель: http://www.bookvoed.ru/book?id=422984
* Искусство программирования на Java, Герберт Шилдт, Джеймс Холмс: http://www.bookvoed.ru/book?id=3483133
* Java EE 7. Основы, Гупта А.: http://www.bookvoed.ru/book?id=6093759
* Effective Java, автор Joshua Bloch. 
* Программист Прагматик (The Pragmatic Programmer) - подробно раскрыты общие методики программирования (книга похожа на сборник полезных советов)
* Java concurrency in practice. - Многопоточность в Java.
http://www.amazon.com/Java-Concurrency-Practice-Brian-Goetz/dp/0321349601
* http://www.booksgid.com/programmer/4686-jekstremalnoe-programmirovanie.html
* http://forcoder.ru/java/java-effektivnoe-programmirovanie-739 - начинающим



Установка и настройка Java
--------------------------
* Скачать Java-plugin (выполнение Java-апплетов, Java Web Start): https://java.com/ru/download
* Скачать Java SE: http://www.oracle.com/technetwork/java/javase/downloads/index.html

* Для удобства нужно задать переменную окружения JAVA_HOME - путь к Java, например: C:\Program Files\Java\jdk1.8.0_20
* И добавить: C:\Program Files\Java\jdk1.8.0_20\bin в пути (переменную PATH).

**install_java.cmd**

``` bat
REM Командный файл для "тихой" установки Java под Windows
REM /s - silent mode (не задавая вопросов)
REM INSTALLDIR - куда ставить JDK 
REM INSTALLDIRPUBJRE - куда ставить JRE
jdk-8u20-windows-x64.exe /s INSTALLDIR=D:\JDK /INSTALLDIRPUBJRE=D:\JRE 
```

Для Windows x64:
----------------
* Java 64 устанавливается в: **C:\Program Files\Java** 
* Java x86 устанавливается в: **C:\Program Files (x86)\Java**

Платформа Java. JVM, сборка мусора, оптимизация, прогрев. JDK, JRE, ME, SE, EE
------------------------------------------------------------------------------
https://lisiynos.googlecode.com/git/java/java_1.html 

Установка и настройка IntelliJ IDEA
-----------------------------------
* https://www.jetbrains.com/idea/download/ - Idea Ultimate Edition + серийный номер
* Указать JDK в настройках проекта (обычно каталог: C:\Program Files\Java\jdk1.8.0_20).

Установка и настройка Apache Maven 
----------------------------------
* http://maven.apache.org/ - скачивание maven
* Распаковать в папку на диске, например в C:\apache-maven-3.2.3\
* Устанавливаем переменную окружения: M2_HOME=C:\apache-maven-3.2.3

Установка и настройка Apache Tomcat
-----------------------------------
* http://archive.apache.org/dist/tomcat/tomcat-8/v8.0.9/bin/apache-tomcat-8.0.9.zip - скачивание Apache Tomcat
* Распаковать в папку на диске, например в 

Установка и настройка Git
-------------------------


Домашнее задание 
----------------
Придумать объектную модель резюме.

