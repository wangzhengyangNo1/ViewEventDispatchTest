# ViewEventDispatchTest
## View的事件分发测试

结果：
事件执行顺序
dispatchTouchEvent --> setOnTouchListener --> onTouchEvent

|  |onTouchEvent|setOnTouchListener|dispatchTouchEvent|
|:--:|:--:|:--:|:--:|
|return|true、false、super.onTouchEvent()|true|super.dispatchTouchEvent()|
|ACTION|————————————|DOWN、MOVE、UP|DOWN、MOVE、UP|
|return|super.onTouchEvent()、false|false|super.dispatchTouchEvent()|
|ACTION|DOWN|DOWN|DOWN|
|return|true|false|super.dispatchTouchEvent()|
|ACTION|DOWN、MOVE、UP|DOWN、MOVE、UP|DOWN、MOVE、UP|
|return|true、false、super.onTouchEvent()|true、false|true|
|ACTION|————————————|————————————|DOWN、MOVE、UP|
|return|true、false、super.onTouchEvent()|true、false|false|
|ACTION|————————————|————————————|DOWN|

## ViewGroup的事件分发测试
