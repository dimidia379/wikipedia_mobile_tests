![Jenkins_params](readmeImages/wiki_logo.png)
# Автотесты для мобильного Android приложения [Wikipedia](https://github.com/wikimedia/apps-android-wikipedia)
## Cписок проверок:

- [x] При старте приложения отображаются 4 экрана Getting started
- [x] Ненулевой результат выдачи при поиске


# Стек технологий
![Java](readmeImages/Java.png)
![Gradle](readmeImages/Gradle.png)
![JUnit5](readmeImages/JUnit5.png)
![Selenide](readmeImages/Selenide.png)
![RestAssured](readmeImages/RestAssured.png)
![Jenkins](readmeImages/Jenkins.png)

![AllureReport](readmeImages/AllureReport.png)
![AllureTestOps](readmeImages/AllureTestOps.png)
![Github](readmeImages/Github.png)
![Selenoid](readmeImages/Selenoid.png)
![Jira](readmeImages/Jira.png)
![Telegram](readmeImages/Telegram.png)


## Для запусков автотестов используется Jenkins.

##### Пример готовой сборки можно посмотреть [по ссылке](https://jenkins.autotests.cloud/job/09-Julia_Zvereva-lesson23/)

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
![Testops](readmeImages/Testops_launch.png)

### Уведомления о прохождении автотестов в Telegram
![Telegram](readmeImages/book24_telegram_report.png)

### Интеграция тестов c таск-трекер системой Jira
![Telegram](readmeImages/jira_issue.png)

### Видео о прохождении тестов
![video](readmeImages/video.gif)

### Команда для локального запуска
```
gradle clean test
```

### Команда для удаленного запуска
```bash
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-Dthreads=${THREADS}
-DremoteDriverUrl=${REMOTE_DRIVER_URL}
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
```
