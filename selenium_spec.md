#  Command

- Contents
  - [Information](#Information)
  - [Description](#Description)
  - [Flow List](#Flow-List)
  - [Command List](#Command-List)
  - [Configuration List](#Configuration-List)
  - [Message List](#Message-List)


## Information
Selenium関連のコマンドを提供します。

- Name : `selenium`
- Custom Package : `com.epion_t3.selenium`

## Description
Seleniumを利用したWebブラウザテストを実行するための機能を提供します。本機能は、&#96;Firefox 47&#96; 以降にのみ対応します。geckodriverが必要となりますのでご注意ください。

## Flow List

## Command List

|Name|Summary|Assert|Evidence|
|:---|:---|:---|:---|
|[WDGet](#WDGet)|指定したURLへ遷移します。  |||
|[WDSelectByIndexElement](#WDSelectByIndexElement)|Selectタグ用のコマンドであり、指定した要素を選択します。  |||
|[WDSelectVisibleTextElement](#WDSelectVisibleTextElement)|Select/Optionタグ用のコマンドであり、指定したoptionのラベル属性値の要素を選択します。  |||
|[WDSelectByValueElements](#WDSelectByValueElements)|Select/Optionタグ用のコマンドであり、指定したvalue属性値の要素を選択します。  |||
|[WDSelectByValueElement](#WDSelectByValueElement)|Select/Optionタグ用のコマンドであり、指定したvalue属性値の要素を選択します。  |||
|[StartLocalWD](#StartLocalWD)|SeleniumのWebDriverを起動します。  |||
|[WDSelectByIndexElements](#WDSelectByIndexElements)|Selectタグ用のコマンドであり、指定した要素を選択します。  |||
|[WDClearSendKeysElements](#WDClearSendKeysElements)|指定した要素に対して入力を行います。  |||
|[EndLocalWD](#EndLocalWD)|SeleniumのWebDriverを終了します。  |||
|[WDSendKeysSpaceElement](#WDSendKeysSpaceElement)|指定した要素に対してスペースキー入力を行います。  |||
|[WDClickElements](#WDClickElements)|指定した要素をクリックします。  |||
|[WDSelectVisibleTextElements](#WDSelectVisibleTextElements)|Select/Optionタグ用のコマンドであり、指定したoptionのラベル属性値の要素を選択します。  |||
|[WDClickElement](#WDClickElement)|指定した要素をクリックします。  |||
|[WDSendKeysElement](#WDSendKeysElement)|指定した要素に対して入力を行います。  |||
|[WDClearSendKeysElement](#WDClearSendKeysElement)|指定した要素に対して入力を行います。  |||
|[WDScreenShot](#WDScreenShot)|操作中のWebDriver/Browserのスクリーンショットを取得します。  |||
|[WDSendKeysElements](#WDSendKeysElements)|指定した要素に対して入力を行います。  |||

------

### WDGet
指定したURLへ遷移します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定したURLに対して遷移します。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDGet」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  target : 遷移先URLを指定

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSelectByIndexElement
Selectタグ用のコマンドであり、指定した要素を選択します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- Select/Optionタグの選択に使用します。
- 指定した要素の指定したインデックスの要素を選択します。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSelectByIndexElement」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  index : 選択するインデックスを指定

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSelectVisibleTextElement
Select/Optionタグ用のコマンドであり、指定したoptionのラベル属性値の要素を選択します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- Select/Optionタグの選択に使用します。
- 指定した要素の指定したインデックスの要素を選択します。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSelectVisibleTextElement」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 選択するvalue属性値

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSelectByValueElements
Select/Optionタグ用のコマンドであり、指定したvalue属性値の要素を選択します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- Select/Optionタグの選択に使用します。
- 指定した要素の指定したインデックスの要素を選択します。
- タグが複数存在する場合に、何個目のタグかを指定することができます。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSelectByIndexElements」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 選択するvalue属性値
  elementIndex : 何番目かを指定するインデックス（0始まり）

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSelectByValueElement
Select/Optionタグ用のコマンドであり、指定したvalue属性値の要素を選択します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- Select/Optionタグの選択に使用します。
- 指定した要素の指定したインデックスの要素を選択します。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSelectByValueElement」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 選択するvalue属性値

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### StartLocalWD
SeleniumのWebDriverを起動します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- SeleniumのWebDriverを起動して、シナリオスコープの変数に保持します。
- 現状、Chrome、FireFox、IEのWebDriverへ対応をしています。
- 複数のWebDriverを同時に立ち上げることが可能です。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「StartLocalWD」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  browser : 起動するブラウザを指定 # (1)
  target : WebDriver/Browserに対して付与する変数名 # (2)
  driverPath : 起動するWebDriverのパスを指定（相対） # (3)
  height : ブラウザの高さ指定
  width : ブラウザの幅指定

```

1. &#96;chrome&#96; &#96;firefox&#96; &#96;ie&#96; のいずれかを指定します。
1. ブラウザを複数個立ち上げて相互に試験するような場合に特定する変数名を指定します。デフォルト値では、&#96;WEBDRIVER_001&#96; のような連番が付与されます。
1. ブラウザを起動するWebDriverのパスを相対パスにて指定する。相対パスの起点はこの定義が含まれるシナリオファイルからとなる。
------

### WDSelectByIndexElements
Selectタグ用のコマンドであり、指定した要素を選択します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- Select/Optionタグの選択に使用します。
- 指定した要素の指定したインデックスの要素を選択します。
- タグが複数存在する場合に、何個目のタグかを指定することができます。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSelectByIndexElements」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  index : 選択するインデックスを指定
  elementIndex : 何番目かを指定するインデックス（0始まり）

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDClearSendKeysElements
指定した要素に対して入力を行います。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定した要素に対して入力を行います。
- 指定した要素をクリアしてから入力します。
- タグが複数存在する場合に、何個目のタグかを指定することができます。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDClearSendKeysElements」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 入力する値
  elementIndex : 何番目かを指定するインデックス（0始まり）

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### EndLocalWD
SeleniumのWebDriverを終了します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- SeleniumのWebDriverを終了して、シナリオスコープの変数を削除します。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「EndLocalWD」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSendKeysSpaceElement
指定した要素に対してスペースキー入力を行います。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定した要素に対してスペースキー入力を行います。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSendKeysSpaceElement」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDClickElements
指定した要素をクリックします。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定した要素をクリックします。
- タグが複数存在する場合に、何個目のタグかを指定することができます。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDClickElements」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  elementIndex : 何番目かを指定するインデックス（0始まり）

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSelectVisibleTextElements
Select/Optionタグ用のコマンドであり、指定したoptionのラベル属性値の要素を選択します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- Select/Optionタグの選択に使用します。
- 指定した要素の指定したインデックスの要素を選択します。
- タグが複数存在する場合に、何個目のタグかを指定することができます。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSelectVisibleTextElements」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 選択するvalue属性値
  elementIndex : 何番目かを指定するインデックス（0始まり）

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDClickElement
指定した要素をクリックします。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定した要素をクリックします。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDClickElement」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSendKeysElement
指定した要素に対して入力を行います。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定した要素に対して入力を行います。
- クリア機能はないため、追記になります。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSendKeysElement」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 入力する値

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDClearSendKeysElement
指定した要素に対して入力を行います。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定した要素に対して入力を行います。
- 指定した要素をクリアしてから入力します。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDClearSendKeysElement」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 入力する値

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDScreenShot
操作中のWebDriver/Browserのスクリーンショットを取得します。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 操作中のWebDriver/Browserのスクリーンショットを取得します。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDScreenShot」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。
------

### WDSendKeysElements
指定した要素に対して入力を行います。
#### Command Type
- Assert : No
- Evidence : No

#### Functions
- 指定した要素に対して入力を行います。
- クリア機能はないため、追記になります。
- タグが複数存在する場合に、何個目のタグかを指定することができます。

#### Structure
```yaml
commands : 
  id : コマンドのID
  command : 「WDSendKeysElements」固定
  summary : コマンドの概要（任意）
  description : コマンドの詳細（任意）
  refWebDriver : 対象とするWebDriver/ブラウザを格納した変数名を指定 # (1)
  selector : 対象を特定するためのセレクター種別
  target : 対象を特定するためのセレクター値
  value : 入力する値
  elementIndex : 何番目かを指定するインデックス（0始まり）

```

1. WebDriver/ブラウザを開始した際に指定した変数名を指定します。デフォルト値を利用する場合にも連番を想定して指定が必要です。

## Configuration List

## Message List

 Command output messages.

|MessageID|MessageContents|
|:---|:---|
|com.epion_t3.selenium.wrn.2001|対象の要素は有効状態ではありません.|
|com.epion_t3.selenium.err.9010|インデックス指定は必須です.|
|com.epion_t3.selenium.err.9008|対象の要素が見つかりません.|
|com.epion_t3.selenium.err.9009|WebDriverのドライバーが見つかりません.ドライバーのパス：{0}|
|com.epion_t3.selenium.err.9004|selectorが無効です.正しいselectorを指定してください.By：{0}, Selector:{1}|
|com.epion_t3.selenium.err.9005|指定された文字列がURLに含まれていません.文字列:{0}|
|com.epion_t3.selenium.err.9006|ブラウザの高さ・幅を指定するには両方の値を指定するようにしてください.|
|com.epion_t3.selenium.err.9007|ブラウザ(WebDriver)が解決できません.参照：{0}|
|com.epion_t3.selenium.err.9011|変数が解決できません.変数：{0}|
|com.epion_t3.selenium.err.9001|ブラウザの指定が不正です.ブラウザ:{0}|
|com.epion_t3.selenium.err.9002|指定されたバージョンは存在しません.バージョン:{0}|
|com.epion_t3.selenium.err.9003|結果ディレクトリの作成に失敗しました.パスの存在有無や権限を確認してください.結果ディレクトリ:{0}|
