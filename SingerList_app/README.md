# ✏️ ListView_ex

## 소개
리스트뷰와 어댑터에 대해 학습하였습니다.

<br>

## 배운점
### ListView란 스크롤이 가능한 항목들을 나열할 때 사용하는 뷰 그룹입니다 

<br>

예시를 이용한 실행 과정은 다음과 같습니다
1. MainActivity에서 데이터를 Adapter로 보낸다. 이때 보내는 데이터를 item 이라고 하자.
2. 이후 받은 item을 activity_main.xml 에서 출력한다.

코드의 진행 과정입니다.
1. ListViewAdapter.kt 에서 List 형태의 데이터를 받게끔 만들어줍니다.
이때 BaseAdapter()을 상속받는 이 Adapter class는 4개의 함수를 기본적으로 implement 해줘야 합니다.
`getView(Int, View ViewGroup)`, `getItem(Int)`, `getItemid(Int)`, `getCout()` 이렇게 총 4가지입니다. 
2. MainActivity에서는 전달할 list_item을 만들어 줍니다. 
3. 만들어 둔 ListViewAdapter.kt에 list_item을 전달해줍니다. 
4. 마지막으로 전달된 것을 mainListView의 adapter와 연결해줍니다.

추가적으로 List값을 출력하기 위해서는 ListViewAdapter.kt에서 getView 함수를 수정해줘야 합니다. 출력하기 위한 listView의 id값을 가져온 다음 text값을 전달받은 값으로 수정해주면 됩니다.

- 추가적인 문법 : '!!' 이란 null이 될 수 있는 타입의 변수이지만, 현재 null이 아닌 경우를 의미할 때 사용합니다 