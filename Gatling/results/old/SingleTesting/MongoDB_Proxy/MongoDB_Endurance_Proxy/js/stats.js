var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3600",
        "ok": "2822",
        "ko": "778"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "95",
        "ok": "95",
        "ko": "52"
    },
    "meanResponseTime": {
        "total": "8",
        "ok": "6",
        "ko": "15"
    },
    "standardDeviation": {
        "total": "7",
        "ok": "7",
        "ko": "3"
    },
    "percentiles1": {
        "total": "11",
        "ok": "1",
        "ko": "14"
    },
    "percentiles2": {
        "total": "15",
        "ok": "14",
        "ko": "15"
    },
    "percentiles3": {
        "total": "17",
        "ok": "16",
        "ko": "18"
    },
    "percentiles4": {
        "total": "23",
        "ok": "22",
        "ko": "27"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 2822,
    "percentage": 78
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
    "count": 778,
    "percentage": 22
},
    "meanNumberOfRequestsPerSecond": {
        "total": "19.672",
        "ok": "15.421",
        "ko": "4.251"
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
        "total": "1800",
        "ok": "1022",
        "ko": "778"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "95",
        "ok": "95",
        "ko": "52"
    },
    "meanResponseTime": {
        "total": "15",
        "ok": "15",
        "ko": "15"
    },
    "standardDeviation": {
        "total": "4",
        "ok": "4",
        "ko": "3"
    },
    "percentiles1": {
        "total": "15",
        "ok": "15",
        "ko": "14"
    },
    "percentiles2": {
        "total": "15",
        "ok": "16",
        "ko": "15"
    },
    "percentiles3": {
        "total": "18",
        "ok": "18",
        "ko": "18"
    },
    "percentiles4": {
        "total": "29",
        "ok": "28",
        "ko": "27"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1022,
    "percentage": 57
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
    "count": 778,
    "percentage": 43
},
    "meanNumberOfRequestsPerSecond": {
        "total": "9.836",
        "ok": "5.585",
        "ko": "4.251"
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
        "total": "1800",
        "ok": "1800",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "34",
        "ok": "34",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1",
        "ok": "1",
        "ko": "-"
    },
    "percentiles3": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles4": {
        "total": "3",
        "ok": "3",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1800,
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
        "total": "9.836",
        "ok": "9.836",
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
