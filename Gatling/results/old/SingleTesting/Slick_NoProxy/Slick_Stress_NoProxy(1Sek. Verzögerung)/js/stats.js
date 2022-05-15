var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "2045",
        "ko": "1015"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "12350",
        "ok": "12318",
        "ko": "12350"
    },
    "meanResponseTime": {
        "total": "671",
        "ok": "483",
        "ko": "1048"
    },
    "standardDeviation": {
        "total": "1803",
        "ok": "1513",
        "ko": "2231"
    },
    "percentiles1": {
        "total": "29",
        "ok": "3",
        "ko": "33"
    },
    "percentiles2": {
        "total": "78",
        "ok": "54",
        "ko": "493"
    },
    "percentiles3": {
        "total": "6631",
        "ok": "2558",
        "ko": "7147"
    },
    "percentiles4": {
        "total": "7719",
        "ok": "7647",
        "ko": "7876"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1781,
    "percentage": 58
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 40,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 224,
    "percentage": 7
},
    "group4": {
    "name": "failed",
    "count": 1015,
    "percentage": 33
},
    "meanNumberOfRequestsPerSecond": {
        "total": "41.351",
        "ok": "27.635",
        "ko": "13.716"
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
        "ok": "515",
        "ko": "1015"
    },
    "minResponseTime": {
        "total": "26",
        "ok": "26",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "12350",
        "ok": "12318",
        "ko": "12350"
    },
    "meanResponseTime": {
        "total": "1246",
        "ok": "1637",
        "ko": "1048"
    },
    "standardDeviation": {
        "total": "2392",
        "ok": "2638",
        "ko": "2231"
    },
    "percentiles1": {
        "total": "34",
        "ok": "48",
        "ko": "33"
    },
    "percentiles2": {
        "total": "1295",
        "ok": "2108",
        "ko": "493"
    },
    "percentiles3": {
        "total": "7351",
        "ok": "7594",
        "ko": "7147"
    },
    "percentiles4": {
        "total": "7858",
        "ok": "7844",
        "ko": "7876"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 320,
    "percentage": 21
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 22,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 173,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "count": 1015,
    "percentage": 66
},
    "meanNumberOfRequestsPerSecond": {
        "total": "20.676",
        "ok": "6.959",
        "ko": "13.716"
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
        "ok": "1530",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "3244",
        "ok": "3244",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "95",
        "ok": "95",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "345",
        "ok": "345",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles2": {
        "total": "12",
        "ok": "12",
        "ko": "-"
    },
    "percentiles3": {
        "total": "521",
        "ok": "521",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1897",
        "ok": "1897",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1461,
    "percentage": 95
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 18,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 51,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "20.676",
        "ok": "20.676",
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
