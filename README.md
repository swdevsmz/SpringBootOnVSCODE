# SpringBootOnVSCODE

####　日本語化　下記プラグインのインストール
https://qiita.com/ntkgcj/items/e77331932c7983dea830


Japanese Language Pack for Visual Studio Code

ctrl + shift + p　でコマンドパレットを開き
configure display language　と入力

locale.jsonファイルが開くので

「en」 と表記されている部分を 「ja」 に変更

### VSCODEでspring boot

下記プラグインのインストール
Java Extension Pack
Spring Boot Extension Pack


javahomeの設定
VSCODE画面左下の歯車アイコン→settingsを選択
javahomeを検索し、setting.jsonにjavaのパスを記載

{
    "java.home": "C:\\Program Files\\Java\\jdk-11.0.4"
}



拡張機能をインストール後にコマンドパレットでspringと検索し、
Spring Initializr: Generate a Maven Projectを選択


デバッグ　→　デバッグの開始を選択し、環境の選択でJavaを選択する

launch.jsonが生成されるので、再度デバッグ　→　デバッグの開始を選択する

SpringBootアプリケーションがローカルサーバーで立ち上がるので以下のURLに接続するとHTMLの内容が表示される
http://localhost:8080/sample
