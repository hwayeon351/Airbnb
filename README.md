# Airbnb
#### 지도 위에 숙소 정보를 보여주는 Airbnb의 간단한 기능을 구현한 안드로이드 앱 입니다.
### Blog
* <https://hwayomingdlog.tistory.com/280>
* <https://hwayomingdlog.tistory.com/281>
* <https://hwayomingdlog.tistory.com/282>
* <https://hwayomingdlog.tistory.com/283>

</br>

## 홈 화면
* 숙소가 존재하는 위치를 마커로 지도에 나타냅니다.
* 특정 마커를 클릭하면 카메라가 이동하며 하단의 ViewPager에 관련 숙소 정보를 띄웁니다.
* 하단의 ViewPager를 스와이프하면 해당 숙소 위치를 나타내는 마커를 향해 카메라가 이동합니다.
* 좌측 상단에 LocationButton을 클릭해 위치 정보 접근에 관한 권한을 수락하면 현재 내 위치를 확인할 수 있습니다.
* 화면의 최하단에 BottomSheet에 'n개의 숙소 정보'가 나타나며, BottomSheet를 위로 드래그하면 BottomSheet가 확장하여 n개의 숙소 정보들을 확인할 수 있습니다.
</br>

## 활용 기술
* BottomSheet - RecyclerView를 포함하는 커스텀 BottomSheet 레이아웃을 구성하였습니다. </br>
behavior_peekHeight 속성을 적용해서 초기 상태에서 하단에 TextView만 노출되도록 하였습니다. </br>
layout_behavior 속성에 BottomSheetBehavior을 적용해서 하단에 peekHeight만큼 노출된 영역을 위로 드래그하면 View가 확장되도록 하였습니다.
* Naver Map API - 네이버 지도 API를 활용해서 카메라 업데이트, 숙소 위치 마커로 노출하기, 현재 위치 표시하기 등의 기능을 구현했습니다.
* Retrofit2 - 숙소 리스트를 가지는 mocking 데이터를 URL로부터 가져오기 위해 Retrofit2 라이브러리를 사용했습니다. </br>
HouseModel, HouseDto, HouseService를 만들어서 Retrofit Service를 통해 숙소 리스트를 가져와 DTO를 통해 모델 객체 리스트로 변환하도록 구현하였습니다. 
* ViewPager2 - 지도 하단에 숙소 정보를 담은 CardView를 스와이프하여 숙소에 관한 정보를 볼 수 있도록 구현하였습니다. </br>
onPageSelected 콜백 함수가 호출되면 position 값을 이용하여 해당 숙소 위치로 카메라가 업데이트 되도록 구현하였습니다.
* RecyclerView - ListAdapter를 상속하는 어뎁터를 구현하여 DiffUtil을 활용해 업데이트 된 항목이 있는 경우에만 데이터를 업데이트하도록 구현했습니다.
</br>

***
<img src="/img/img0.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img1.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img2.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img3.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img4.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img5.png" width="300px" height="600px" title="" alt=""></img>
