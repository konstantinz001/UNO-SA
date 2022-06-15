var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "1890",
        "ok": "1712",
        "ko": "178"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "4708",
        "ok": "4708",
        "ko": "4208"
    },
    "meanResponseTime": {
        "total": "165",
        "ok": "169",
        "ko": "125"
    },
    "standardDeviation": {
        "total": "448",
        "ok": "432",
        "ko": "581"
    },
    "percentiles1": {
        "total": "12",
        "ok": "4",
        "ko": "15"
    },
    "percentiles2": {
        "total": "17",
        "ok": "20",
        "ko": "16"
    },
    "percentiles3": {
        "total": "1126",
        "ok": "1129",
        "ko": "25"
    },
    "percentiles4": {
        "total": "1226",
        "ok": "1214",
        "ko": "3326"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1507,
    "percentage": 80
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 181,
    "percentage": 10
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 24,
    "percentage": 1
},
    "group4": {
    "name": "failed",
    "count": 178,
    "percentage": 9
},
    "meanNumberOfRequestsPerSecond": {
        "total": "7.269",
        "ok": "6.585",
        "ko": "0.685"
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
        "total": "945",
        "ok": "767",
        "ko": "178"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "4708",
        "ok": "4708",
        "ko": "4208"
    },
    "meanResponseTime": {
        "total": "328",
        "ok": "375",
        "ko": "125"
    },
    "standardDeviation": {
        "total": "590",
        "ok": "582",
        "ko": "581"
    },
    "percentiles1": {
        "total": "17",
        "ok": "71",
        "ko": "15"
    },
    "percentiles2": {
        "total": "269",
        "ok": "1040",
        "ko": "16"
    },
    "percentiles3": {
        "total": "1179",
        "ok": "1183",
        "ko": "25"
    },
    "percentiles4": {
        "total": "3212",
        "ok": "1583",
        "ko": "3326"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 562,
    "percentage": 59
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 181,
    "percentage": 19
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 24,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 178,
    "percentage": 19
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.635",
        "ok": "2.95",
        "ko": "0.685"
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
        "total": "945",
        "ok": "945",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "11",
        "ok": "11",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles2": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles3": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    },
    "percentiles4": {
        "total": "8",
        "ok": "8",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 945,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "3.635",
        "ok": "3.635",
        "ko": "-"
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
