-) Пример начальной разработки моей страницы HTML для обучения.

<details>

<summary></summary>


```javascript
Первый файл с расширением HTML открывает втой файл HTML (второй файл открывает видео в пределах необходимого для ответа на вопрос фрагмента). При этом в том числе первый файл передает второму файлу необходимые параметры для определения пути к видео и определения границ фрагмента видео. 
Пример первого файла (находится в начальной стадии разработки): 

<html>
<head>
    <script>
        var startURLendName ='file:///C:/Users/Vladi/Anaconda/ansel/test1/test50.html'
        function sendForm(obj)
        {
        // alert(obj.name);
        window.open (startURLendName + obj.name, '_blank')
        };
    </script>
</head>
<body>
<p>
<input type="button" name="?180&200&/Web/Lesson/1/Урок%201.%20Веб-технологии.%20Вчера,%20сегодня,%20завтра%20—%20копия.mp4" class="btn" 
value='open a video fragment of this topic' 
onclick="sendForm(this);">
</p><p>
<input type="button" name="?280&300&/Web/Lesson/1/Урок%201.%20Веб-технологии.%20Вчера,%20сегодня,%20завтра%20—%20копия.mp4" class="btn" 
value='open a video fragment of this topic' 
onclick="sendForm(this);">
</p>
</body>
</html>

Пример второго файла (находится в начальной стадии разработки):

<!DOCTYPE html> 
<html> 

<body> 
<p>
<button onclick="setSound()"; type="button">sound switch (on/off)</button>
<button onclick="setSoundMinus()"; type="button">sound minus</button>
<button onclick="setSoundPlus()"; type="button">sound plus</button>
</p>
<video id="myVideo" width="80%" height="80%" autoplay muted ontimeupdate = "setCurTime()">
 
   Your browser does not support the video tag.
</video><br>
<p id="demo"></p>
<script>
 var p_url=location.search.substring(1);
 var parametr=p_url.split("&");
 var s = parametr[0]; 
 //alert("var s = parametr[0]; = " + s)
 var f = parametr[1];
 var e = parametr[2];
 var MP = 0.1;
 var vid = document.getElementById("myVideo");
 var source = document.createElement('source');
 var pathURL = window.localStorage.getItem('C_7LAT5TG_func1')
 if(pathURL === null){
  pathURL = "C:/Users/Vladi/Documents/EDUCATION/Named/"
  
 }
 var pathName = window.localStorage.getItem('C_7LAT5TG_func2')
 if(pathName === null){
  pathName = e
 
 }
 var pathURLName = (pathURL + pathName)
 
source.setAttribute('src', pathURLName);
source.setAttribute('type', 'video/mp4');

vid.appendChild(source);
vid.play();
console.log({
  src: source.getAttribute('src'),
  type: source.getAttribute('type'),
});
 
// Attach a "timeupdate" event to the video
vid.addEventListener("timeupdate", getCurTime);

// Display the current playback position of the video in a p element with id="demo"
function getCurTime() { 
document.getElementById("demo").innerHTML = "The current playback position is " + vid.currentTime + " seconds.";
} 
function setSound(){
if(vid.muted === false){
vid.muted = true;}
else{vid.muted =false;}
vid.currentTime = s
}

function setCurTime() {
if (vid.currentTime < s || vid.currentTime > f){
vid.currentTime = s;
} 
}

function setSoundPlus(){
if((vid.volume + MP) < 1.0){
vid.volume = vid.volume + MP;}
else{vid.value = 1.0;}
}

function setSoundMinus(){
if((vid.volume - MP) > 0.0){
vid.volume = vid.volume - MP;}
else{vid.volume = 0.0;}
}

</script>

</body> 

</html>

```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

-) 

<details>

<summary></summary>


```javascript


```

</details>

