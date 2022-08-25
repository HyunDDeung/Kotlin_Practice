# ✏️ Nav_Fragment

## 소개
### Navigation 기능을 이용하여 Fragment의 이동을 학습하였습니다.

<br>

## 배운점
기존의 경우 다른 화면으로 전환하기 위해서는 새로운 Activity를 만들어서 이동시켜 주었습니다. 그러나 그렇게 된다면 더 복잡해지고 메모리적으로도 효울적이지 못하다는 단점이 존재합니다. 

이러한 단점을 해결하기 위해서 Navigation과 Fragment에 대해서 학습하였다. Navigation을 이용하게 된다면 MainActivity는 고정시켜 두고, Fragment만 이동하며 다른 화면을 보여줄 수 있게 된다.

## 적용법
MainNavigation 화면과 이동할 Fragment들을 만들어 준다.
이후 MainNavigation에서 서로 이동시키고 싶은 Fragment 끼리 연결시켜 준다.
본인의 경우 이동 방식을 버튼으로 처리하였기 때문에, 버튼의 setOnClickListener을 이용하여 연결부의 아이디를 불러오는 형식으로 navigate를 실행시켜주었다.