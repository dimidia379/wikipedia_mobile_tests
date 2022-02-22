![Jenkins_params](readmeImages/wiki_logo.png)
# Автотесты для мобильного Android приложения [Wikipedia](https://github.com/wikimedia/apps-android-wikipedia)
## Cписок проверок:

- [x] При старте приложения отображаются 4 экрана Getting started
- [x] Ненулевой результат выдачи при поиске


# Стек технологий

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="E:\jprojects\wikipedia_mobile_tests\readmeImages\logo\Intelij_IDEA.svg">
<img width="6%" title="Java" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Java.svg">
<img width="6%" title="Selenide" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Jenkins.svg">
<img width="6%" title="Allure TestOps" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Allure_TestOps.svg">
<img width="6%" title="Appium" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Appium.svg">
<img width="6%" title="BrowserStack" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Browserstack.svg">
<img width="6%" title="Telegram" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Telegram.svg">
<img width="6%" title="Jira" src="E:\jprojects\wikipedia_mobile_tests\readmeImages/logo/Jira.svg">
</p>

Автотесты написаны на <code>Java</code> с использованием фреймворков <code>Selenide</code> и <code>Appium</code>.
<code>BrowserStack</code> выполняет запуск приложения на удаленном мобильном Android-устройстве.
<code>Selenoid</code> выполняет запуск приложения на удаленном сервере в контейнерах <code>Docker</code>.
Для автоматизированной сборки проекта используется <code>Gradle</code>.
<code>Jenkins</code> выполняет запуск тестов. <code>Allure Report</code> формирует отчет о запуске тестов.
Автотесты интегрируются с тест-менеджмент системой <code>Allure TestOps</code> и таск-трекер системой <code>Jira</code>.
После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.

##### Пример готовой сборки Jenkins можно посмотреть [по ссылке](https://jenkins.autotests.cloud/job/009-JuliaZvereva-Lesson23mob/)

### Параметры запуска в Jenkins
![Jenkins_params](readmeImages/Jenkins_params.png)

### Статистика запусков в Jenkins
![Jenkins_statistic](readmeImages/Jenkins_statistic.png)

### Отчёт о прохождении автотестов в Allure Report
![Allure_report](readmeImages/Allure_report.png)

### Список автотестов в Allure Report
![Allure_suite](readmeImages/Allure_suite.png)

### Хранение тестовой документации в Allure TestOps
![Testops](readmeImages/Allure_testops_cases.png)

### Прохождение тестов в Allure TestOps
![Testops](readmeImages/Testops_cases1.png)

### Уведомления о прохождении автотестов в Telegram
![Telegram](readmeImages/wiki_telegram_report.png)

### Интеграция тестов c таск-трекер системой Jira
![Telegram](readmeImages/jira_issue.png)

