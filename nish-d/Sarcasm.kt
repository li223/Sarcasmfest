fun main() {
    val text = "this does not align with our core values"

        val builder = StringBuilder()
		var isUpper = true
		builder.append(text[0])
        for (i in 1 until text.length) {
            if(text[i-1]>='a' && text[i-1]<='z'){
                isUpper = !isUpper
            }
            if(text[i]>='a' && text[i]<='z'){
            	if (isUpper) {
                	builder.append(text[i].toUpperCase())
            	} else {
                	builder.append(text[i].toLowerCase())
            	}
            }else{
                builder.append(text[i])
            }
        }
        val result = builder.toString()
        println(result)
}