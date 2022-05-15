var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "2074",
        "ko": "986"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "28"
    },
    "maxResponseTime": {
        "total": "12820",
        "ok": "12792",
        "ko": "12820"
    },
    "meanResponseTime": {
        "total": "647",
        "ok": "634",
        "ko": "674"
    },
    "standardDeviation": {
        "total": "2227",
        "ok": "2475",
        "ko": "1582"
    },
    "percentiles1": {
        "total": "30",
        "ok": "5",
        "ko": "34"
    },
    "percentiles2": {
        "total": "48",
        "ok": "38",
        "ko": "114"
    },
    "percentiles3": {
        "total": "3447",
        "ok": "3449",
        "ko": "3444"
    },
    "percentiles4": {
        "total": "12406",
        "ok": "12474",
        "ko": "5683"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1902,
    "percentage": 62
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 26,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 146,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 986,
    "percentage": 32
},
    "meanNumberOfRequestsPerSecond": {
        "total": "40.8",
        "ok": "27.653",
        "ko": "13.147"
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
        "ok": "544",
        "ko": "986"
    },
    "minResponseTime": {
        "total": "26",
        "ok": "26",
        "ko": "28"
    },
    "maxResponseTime": {
        "total": "12820",
        "ok": "12792",
        "ko": "12820"
    },
    "meanResponseTime": {
        "total": "1267",
        "ok": "2343",
        "ko": "674"
    },
    "standardDeviation": {
        "total": "3023",
        "ok": "4402",
        "ko": "1582"
    },
    "percentiles1": {
        "total": "34",
        "ok": "39",
        "ko": "34"
    },
    "percentiles2": {
        "total": "727",
        "ok": "1357",
        "ko": "114"
    },
    "percentiles3": {
        "total": "11581",
        "ok": "12360",
        "ko": "3444"
    },
    "percentiles4": {
        "total": "12689",
        "ok": "12740",
        "ko": "5683"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 372,
    "percentage": 24
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 26,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 146,
    "percentage": 10
},
    "group4": {
    "name": "failed",
    "count": 986,
    "percentage": 64
},
    "meanNumberOfRequestsPerSecond": {
        "total": "20.4",
        "ok": "7.253",
        "ko": "13.147"
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
        "total": "748",
        "ok": "748",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "26",
        "ok": "26",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "73",
        "ok": "73",
        "ko": "-"
    },
    "percentiles1": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "percentiles2": {
        "total": "10",
        "ok": "9",
        "ko": "-"
    },
    "percentiles3": {
        "total": "147",
        "ok": "147",
        "ko": "-"
    },
    "percentiles4": {
        "total": "373",
        "ok": "373",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1530,
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
        "total": "20.4",
        "ok": "20.4",
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
