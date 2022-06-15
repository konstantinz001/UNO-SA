var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "1868",
        "ko": "1192"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "9928",
        "ok": "9928",
        "ko": "9426"
    },
    "meanResponseTime": {
        "total": "1784",
        "ok": "1494",
        "ko": "2239"
    },
    "standardDeviation": {
        "total": "2196",
        "ok": "2458",
        "ko": "1604"
    },
    "percentiles1": {
        "total": "966",
        "ok": "14",
        "ko": "2030"
    },
    "percentiles2": {
        "total": "2040",
        "ok": "2399",
        "ko": "2038"
    },
    "percentiles3": {
        "total": "6500",
        "ok": "6790",
        "ko": "5895"
    },
    "percentiles4": {
        "total": "7841",
        "ok": "7960",
        "ko": "7365"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1249,
    "percentage": 41
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 111,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 508,
    "percentage": 17
},
    "group4": {
    "name": "failed",
    "count": 1192,
    "percentage": 39
},
    "meanNumberOfRequestsPerSecond": {
        "total": "42.5",
        "ok": "25.944",
        "ko": "16.556"
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
        "total": "1530",
        "ok": "664",
        "ko": "866"
    },
    "minResponseTime": {
        "total": "13",
        "ok": "13",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "9928",
        "ok": "9928",
        "ko": "9426"
    },
    "meanResponseTime": {
        "total": "2624",
        "ok": "3024",
        "ko": "2318"
    },
    "standardDeviation": {
        "total": "2431",
        "ok": "2957",
        "ko": "1876"
    },
    "percentiles1": {
        "total": "2030",
        "ok": "2640",
        "ko": "2030"
    },
    "percentiles2": {
        "total": "4846",
        "ok": "5835",
        "ko": "2047"
    },
    "percentiles3": {
        "total": "7284",
        "ok": "7518",
        "ko": "6379"
    },
    "percentiles4": {
        "total": "8353",
        "ok": "8722",
        "ko": "7547"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 289,
    "percentage": 19
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 15,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 360,
    "percentage": 24
},
    "group4": {
    "name": "failed",
    "count": 866,
    "percentage": 57
},
    "meanNumberOfRequestsPerSecond": {
        "total": "21.25",
        "ok": "9.222",
        "ko": "12.028"
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
        "total": "1530",
        "ok": "1204",
        "ko": "326"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2003"
    },
    "maxResponseTime": {
        "total": "7988",
        "ok": "7988",
        "ko": "2063"
    },
    "meanResponseTime": {
        "total": "944",
        "ok": "650",
        "ko": "2029"
    },
    "standardDeviation": {
        "total": "1525",
        "ok": "1597",
        "ko": "10"
    },
    "percentiles1": {
        "total": "6",
        "ok": "3",
        "ko": "2030"
    },
    "percentiles2": {
        "total": "2021",
        "ok": "18",
        "ko": "2035"
    },
    "percentiles3": {
        "total": "4565",
        "ok": "5181",
        "ko": "2047"
    },
    "percentiles4": {
        "total": "6540",
        "ok": "6710",
        "ko": "2050"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 960,
    "percentage": 63
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 96,
    "percentage": 6
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 148,
    "percentage": 10
},
    "group4": {
    "name": "failed",
    "count": 326,
    "percentage": 21
},
    "meanNumberOfRequestsPerSecond": {
        "total": "21.25",
        "ok": "16.722",
        "ko": "4.528"
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
