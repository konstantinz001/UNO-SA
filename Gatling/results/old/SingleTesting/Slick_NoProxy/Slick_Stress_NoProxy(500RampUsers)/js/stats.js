var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "30060",
        "ok": "3586",
        "ko": "26474"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "631"
    },
    "maxResponseTime": {
        "total": "60030",
        "ok": "57385",
        "ko": "60030"
    },
    "meanResponseTime": {
        "total": "4470",
        "ok": "4854",
        "ko": "4418"
    },
    "standardDeviation": {
        "total": "8810",
        "ok": "10408",
        "ko": "8570"
    },
    "percentiles1": {
        "total": "2419",
        "ok": "907",
        "ko": "2450"
    },
    "percentiles2": {
        "total": "3317",
        "ok": "3753",
        "ko": "3257"
    },
    "percentiles3": {
        "total": "7305",
        "ok": "34146",
        "ko": "6292"
    },
    "percentiles4": {
        "total": "60003",
        "ok": "48684",
        "ko": "60004"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1752,
    "percentage": 6
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 118,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1716,
    "percentage": 6
},
    "group4": {
    "name": "failed",
    "count": 26474,
    "percentage": 88
},
    "meanNumberOfRequestsPerSecond": {
        "total": "233.023",
        "ok": "27.798",
        "ko": "205.225"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "15030",
        "ok": "600",
        "ko": "14430"
    },
    "minResponseTime": {
        "total": "34",
        "ok": "34",
        "ko": "631"
    },
    "maxResponseTime": {
        "total": "60030",
        "ok": "57385",
        "ko": "60030"
    },
    "meanResponseTime": {
        "total": "6303",
        "ok": "20827",
        "ko": "5699"
    },
    "standardDeviation": {
        "total": "12105",
        "ok": "17823",
        "ko": "11414"
    },
    "percentiles1": {
        "total": "2427",
        "ok": "23166",
        "ko": "2402"
    },
    "percentiles2": {
        "total": "3482",
        "ok": "35481",
        "ko": "3291"
    },
    "percentiles3": {
        "total": "37755",
        "ok": "49573",
        "ko": "34320"
    },
    "percentiles4": {
        "total": "60009",
        "ok": "52514",
        "ko": "60009"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 83,
    "percentage": 1
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 19,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 498,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 14430,
    "percentage": 96
},
    "meanNumberOfRequestsPerSecond": {
        "total": "116.512",
        "ok": "4.651",
        "ko": "111.86"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "15030",
        "ok": "2986",
        "ko": "12044"
    },
    "minResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "11549",
        "ok": "11549",
        "ko": "7255"
    },
    "meanResponseTime": {
        "total": "2638",
        "ok": "1644",
        "ko": "2884"
    },
    "standardDeviation": {
        "total": "1416",
        "ok": "2166",
        "ko": "1016"
    },
    "percentiles1": {
        "total": "2416",
        "ok": "376",
        "ko": "2507"
    },
    "percentiles2": {
        "total": "3210",
        "ok": "2878",
        "ko": "3229"
    },
    "percentiles3": {
        "total": "5345",
        "ok": "6220",
        "ko": "5198"
    },
    "percentiles4": {
        "total": "6663",
        "ok": "8243",
        "ko": "6304"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1669,
    "percentage": 11
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 99,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1218,
    "percentage": 8
},
    "group4": {
    "name": "failed",
    "count": 12044,
    "percentage": 80
},
    "meanNumberOfRequestsPerSecond": {
        "total": "116.512",
        "ok": "23.147",
        "ko": "93.364"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
