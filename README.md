# tencent-spring-boot-starter

[tencent-spring-boot-starter-tencent](https://github.com/lunasaw/tencent-spring-boot-starter)

<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/lunasaw/tencent-spring-boot-starter/">
    <img src="https://tva1.sinaimg.cn/large/008i3skNgy1grlpk1p1wwj30hb0a0ab2.jpg" alt="Logo" width="800" height="250">
  </a>
<h3 align="center">腾讯开放平台工具</h3>
  <p align="center">
    腾讯开放平台工具 springboot starter
    <br />
    <a href="https://github.com/lunasaw/tencent-spring-boot-starter"><strong>探索本项目的文档 »</strong></a>
    <br />
    <br />
    <a href="">查看Demo</a>
    ·
    <a href="">报告Bug</a>
    ·
    <a href="https://github.com/lunasaw/tencent-spring-boot-starter/issues">提出新特性</a>
  </p>

</p>

## 日志

增加语音识别相关接口，包括语音合成，实时识别等

增加微信支付Api接口

- 超时30分钟自动关闭订单
- Mq队列处理

增加腾讯地图Api接口

增加腾讯人脸识别等Api接口

## 目录

- [安装步骤](#安装步骤)
- [文件目录说明](#文件目录说明)
- [文档](#文档)
- [作者](#作者)

###### **安装步骤**

1. Get a free API Key at [https://console.cloud.tencent.com](https://console.cloud.tencent.com)

3. Clone the repo

```sh
git clone https://github.com/lunasaw/tencent-spring-boot-starter.git
```

直接使用引入项目依赖

```xml

<dependency>
    <groupId>io.github.lunasaw</groupId>
    <artifactId>tencent-spring-boot-starter-tencent</artifactId>
    <version>2.2.3-RELEASE</version>
</dependency>
```

### 文档

[文档链接](https://lunasaw.github.io/tencent-spring-boot-starter/)



在配置文件application.properties加入可选配置

```text
luna:
  ten:
    # 腾讯地图api
    mapKey: xxx
    # 腾讯api
    secretId: xxx
    secretKey: xxx
    # 腾讯市场api
    skyEyeSecretid: xxx
    skyEyeSecretkey: xxx

  #微信支付信息配置
  wechat:
    # 应用ID
    appId: xxx
    # 公钥
    partner: xxx
    # 私钥
    partnerKey: xxx
    # 异步通知URL
    notifyUrl: xxx

mq:
  pay:
    exchange: exchange.order
    queue: queue.order
    routing: queue.order

```

引用示例 若采用SpringBoot构建项目可通过将第三方包中的TencentConfigValue,TencentPayConfigValue通过Spring配置文件注入Spring管理

需在properties或者yml配置文件中配置相应key

若非Spring项目可直接通过调用静态APi传入key和id进行调用

```java

@RunWith(SpringRunner.class)
@SpringBootTest
public class TencentApiTest {

    @Autowired
    private TencentPayMqConfigValue tencentPayMqConfigValue;


    @Autowired
    private TencentConfigValue tencentConfigValue;

    @Test
    public void atest() {
        System.out.println(tencentPayMqConfigValue.getExchange());
        System.out.println(tencentConfigValue.getSecretid());
        JSONObject jsonObject = TencentMarketApi.checkIdByLuna(tencentConfigValue.getSkyEyeSecretid(), tencentConfigValue.getSkyEyeSecretkey(), "陈章月", "500384199911072412");
        System.out.println(JSON.toJSONString(jsonObject));
    }
}

```

结果
![result](http://www.isczy.tk/luna-image-bed/uPic/Snipaste_2021-03-27_19-42-01.png)

### 文件目录说明

eg:

```
./
├── README.md
├── _config.yml
├── logo
│   └── tencent-logo.png
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── luna
│   │   │           └── tencent
│   │   │               ├── api
│   │   │               │   ├── TencentAuthAPI.java
│   │   │               │   ├── TencentCloudAPITC3.java
│   │   │               │   ├── TencentConstant.java
│   │   │               │   ├── TencentFaceApi.java
│   │   │               │   ├── TencentGroupPersonApi.java
│   │   │               │   ├── TencentHotWordsApi.java
│   │   │               │   ├── TencentMapApi.java
│   │   │               │   ├── TencentMarketApi.java
│   │   │               │   ├── TencentMessageApi.java
│   │   │               │   ├── TencentRealTimeVoiceApi.java
│   │   │               │   └── TencntVoiceApi.java
│   │   │               ├── config
│   │   │               │   ├── TencentApiAutoConfiguration.java
│   │   │               │   ├── TencentPayAutoConfiguration.java
│   │   │               │   └── TencentPayQueueConfiguration.java
│   │   │               ├── dto
│   │   │               │   ├── error
│   │   │               │   │   └── ErrorDTO.java
│   │   │               │   ├── face
│   │   │               │   │   └── FaceInfosDTO.java
│   │   │               │   ├── group
│   │   │               │   │   ├── GroupExDescriptionInfoDTO.java
│   │   │               │   │   └── PersonExDescriptionInfoDTO.java
│   │   │               │   ├── hotword
│   │   │               │   │   ├── HotWordDTO.java
│   │   │               │   │   └── VocabDTO.java
│   │   │               │   ├── map
│   │   │               │   │   ├── AddressComponentDTO.java
│   │   │               │   │   ├── AddressResultDTO.java
│   │   │               │   │   ├── Ip2AddressResultDTO.java
│   │   │               │   │   ├── KeyWordSearchResultDTO.java
│   │   │               │   │   └── LocationDTO.java
│   │   │               │   └── voice
│   │   │               │       ├── VoiceFastIdentifyDTO.java
│   │   │               │       └── VoiceOneMinutesDTO.java
│   │   │               ├── pay
│   │   │               │   ├── api
│   │   │               │   │   └── TencentPayApi.java
│   │   │               │   ├── constant
│   │   │               │   │   └── TencentPayConstant.java
│   │   │               │   ├── dto
│   │   │               │   │   ├── CloseOderResultDTO.java
│   │   │               │   │   ├── NotifyResultDTO.java
│   │   │               │   │   └── QueryResultDTO.java
│   │   │               │   ├── entity
│   │   │               │   │   └── TencentPayEntity.java
│   │   │               │   ├── mq
│   │   │               │   │   ├── DelayMessageListener.java
│   │   │               │   │   └── OrderMessageListener.java
│   │   │               │   └── nortify
│   │   │               │       ├── TencentPayNotifyController.java
│   │   │               │       └── TencentPayNotifyService.java
│   │   │               ├── properties
│   │   │               │   ├── TencentApiConfigProperties.java
│   │   │               │   ├── TencentPayConfigProperties.java
│   │   │               │   └── TencentPayMqConfigProperties.java
│   │   │               └── response
│   │   │                   ├── card
│   │   │                   │   ├── IdCardAndBankCardCheckInfoResponse.java
│   │   │                   │   ├── IdCardCheckInfoResponse.java
│   │   │                   │   ├── IdCardOcrResponse.java
│   │   │                   │   └── IdCardPictureCheckInfoResponse.java
│   │   │                   ├── group
│   │   │                   │   ├── AddFaceResultResponse.java
│   │   │                   │   ├── CandidateResponse.java
│   │   │                   │   ├── CheckPersonInGroupResponse.java
│   │   │                   │   ├── CompareFaceResponse.java
│   │   │                   │   ├── GroupCandidateResponse.java
│   │   │                   │   ├── PersonBaseInfoResponse.java
│   │   │                   │   ├── PersonGroupInfoResponse.java
│   │   │                   │   └── ResultsReturnsByGroupResponse.java
│   │   │                   ├── message
│   │   │                   │   ├── MobileCheckInfoResponse.java
│   │   │                   │   └── SendStatusDTO.java
│   │   │                   └── voice
│   │   │                       ├── FlashRecognitionResponse.java
│   │   │                       ├── SpeechRecognitionResponse.java
│   │   │                       ├── SpeechRecognitionResponseResult.java
│   │   │                       ├── VoiceIdentifyResponse.java
│   │   │                       └── VoiceOneMinutesResponse.java
│   │   └── resources
│   │       ├── META-INF
│   │       │   └── spring.factories
│   │       ├── application-pro.yml
│   │       └── log
│   │           └── logback.xml
│   └── test
│       └── java

```


### 作者

luna

email Keyluna@126.com &ensp; qq:1173288254

*您也可以在贡献者名单中参看所有参与该项目的开发者。*

### 版权说明

该项目签署了MIT 授权许可，详情请参阅 [LICENSE.txt](https://github.com/lunasaw/luna-commons/blob/master/LICENSE)

### 鸣谢[]()

- [tencent]()
- [rabbitmq]()

<!-- links -->

[your-project-path]:lunasaw/tencent-spring-boot-starter

[contributors-shield]: https://img.shields.io/github/contributors/lunasaw/tencent-spring-boot-starter.svg?style=flat-square

[contributors-url]: https://github.com/lunasaw/tencent-spring-boot-starter/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/lunasaw/tencent-spring-boot-starter.svg?style=flat-square

[forks-url]: https://github.com/lunasaw/tencent-spring-boot-starter/network/members

[stars-shield]: https://img.shields.io/github/stars/lunasaw/tencent-spring-boot-starter.svg?style=flat-square

[stars-url]: https://github.com/lunasaw/tencent-spring-boot-starter/stargazers

[issues-shield]: https://img.shields.io/github/issues/lunasaw/tencent-spring-boot-starter.svg?style=flat-square

[issues-url]: https://img.shields.io/github/issues/lunasaw/tencent-spring-boot-starter.svg

[license-shield]: https://img.shields.io/github/license/lunasaw/tencent-spring-boot-starter.svg?style=flat-square

[license-url]: https://github.com/lunasaw/tencent-spring-boot-starter/blob/master/LICENSE.txt

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555

[linkedin-url]: https://linkedin.com/in/tencent-spring-boot-starter




