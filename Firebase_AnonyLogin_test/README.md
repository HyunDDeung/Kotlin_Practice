# ✏️ SingerList_app

## 소개
RecyclerView와 Navigation기능을 이용하여 가수의 사진을 클릭하면 노래 리스트를 보여주는 어플

<br>

## 배운점
RecyclerView와 Navigation을 통한 Fragment 전환에 대해서 학습하였다.

<br>

## 시행착오
RecyclerView를 이용하여 음악 리스트를 출력하는 과정에서 노래가 한 줄마다 출력되지 않고, 음악 사이사이에 많은 여백이 생겨 스크롤을 해야 확인할 수 있다는 문제점이 발생했다. 이 경우는 rv_item 파일 즉, RecyclerView에서 Item을 나타내는 파일의 layout이 잘못 설정되어 있어서 발생한 문제였다.

Text의 layout이 모두 match_content로 설정되어 있어서 출력되는 Text들이 차례대로 출력되지 못하고 한 페이지에 하나씩 출력되기에 많은 공백이 발생하는 것이었다. 이를 wrap_content로 수정해주자 원하고자 하는 결과값을 얻을 수 있었다.