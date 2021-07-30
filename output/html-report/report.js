$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/sp02/claro.com.feature");
formatter.feature({
  "name": "Soliciud de un celular postpago con portabilidad",
  "description": "Como usuario quiero solicitar un celular con plan postpago con portabilidad",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sp01"
    }
  ]
});
formatter.scenario({
  "name": "Un usuario celular con plan postpago con portabilidad",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sp01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "estoy en la opcion principal de la tienda claro se abre el home Regalo y me registra",
  "keyword": "Given "
});
formatter.match({
  "location": "PostpagoMaxTest.homeopcion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono el celular postpago con portabilidad",
  "keyword": "When "
});
formatter.match({
  "location": "PostpagoMaxTest.buscarCelular()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrego a mi bolsa",
  "keyword": "And "
});
formatter.match({
  "location": "PostpagoMaxTest.añadirMibolsa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono accesorios",
  "keyword": "And "
});
formatter.match({
  "location": "PostpagoMaxTest.veraccesorios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "completo el Formulario",
  "keyword": "And "
});
formatter.match({
  "location": "PostpagoMaxTest.completarFormulario()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element is not clickable at point (378, 846)\n  (Session info: chrome\u003d89.0.4389.128)\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027DESKTOP-SKCT1LB\u0027, ip: \u0027192.168.43.228\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.128, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\LUISEV~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54558}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 99dd06574d52952d4e64c94367618631\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat pe.com.admequipo.stepdefinition.BaseStep.click(BaseStep.java:193)\r\n\tat pe.com.admequipo.stepdefinition.sp02.PostpagoMaxTest.completarFormulario(PostpagoMaxTest.java:153)\r\n\tat ✽.completo el Formulario(file:src/test/resources/features/sp02/claro.com.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Finalizo la Compra",
  "keyword": "And "
});
formatter.match({
  "location": "PostpagoMaxTest.finalizarCompra()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "me registro en la pasarela de Pago",
  "keyword": "Then "
});
formatter.match({
  "location": "PostpagoMaxTest.pasarelaPago()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});