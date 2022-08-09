# ✏️ TWICE_app

## 소개
### Splash 화면 이후, 이미지를 클릭하면 해당 이미지를 확대해 보여주는 app입니다.

<br>

## 배운점
- AndroidManifest.xml 파일을 수정하여 실행시작 파일을 수정할 수 있다.
- Handler을 이용하여 Splash 화면 제작하기
- margin과 padding
- CardView를 활용한 cardCornerRadius
- Kotlin의 경우 findViewById를 이용하여 id값을 가져오는 방법도 있지만, 바로 id값을 입력해도 사용할 수 있다.
- Intent를 전환할 때 intent.putExtra(name, value)를 이용하여 데이터를 함께 전달할 수 있다.
- Intent를 전환하여 사진을 확대할 때, 각 사진별로 activity를 제작하는 것이 아닌, setImageResource를 이용하여 한 액티비티 내에서 이미지를 수정하는 방식으로 해결 가능하다