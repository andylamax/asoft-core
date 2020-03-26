fun andylamax(lib: String, platform: String, ver: String): String {
    return "com.github.andylamax.$lib:$lib-$platform:$ver"
}

fun asoftTest(platform: String) = andylamax("asoft-test", platform, versions.asoft.test)