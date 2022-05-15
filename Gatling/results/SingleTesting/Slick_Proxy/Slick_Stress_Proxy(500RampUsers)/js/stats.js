var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "30060",
        "ok": "3192",
        "ko": "26868"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "31"
    },
    "maxResponseTime": {
        "total": "60020",
        "ok": "59981",
        "ko": "60020"
    },
    "meanResponseTime": {
        "total": "4476",
        "ok": "4629",
        "ko": "4458"
    },
    "standardDeviation": {
        "total": "8539",
        "ok": "10329",
        "ko": "8301"
    },
    "percentiles1": {
        "total": "2384",
        "ok": "204",
        "ko": "2448"
    },
    "percentiles2": {
        "total": "3763",
        "ok": "5079",
        "ko": "3714"
    },
    "percentiles3": {
        "total": "8824",
        "ok": "31969",
        "ko": "7510"
    },
    "percentiles4": {
        "total": "57682",
        "ok": "54283",
        "ko": "58301"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1898,
    "percentage": 6
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 53,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1241,
    "percentage": 4
},
    "group4": {
    "name": "failed",
    "count": 26868,
    "percentage": 89
},
    "meanNumberOfRequestsPerSecond": {
        "total": "250.5",
        "ok": "26.6",
        "ko": "223.9"
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
        "ok": "556",
        "ko": "14474"
    },
    "minResponseTime": {
        "total": "29",
        "ok": "29",
        "ko": "31"
    },
    "maxResponseTime": {
        "total": "60020",
        "ok": "59981",
        "ko": "60020"
    },
    "meanResponseTime": {
        "total": "6086",
        "ok": "18209",
        "ko": "5620"
    },
    "standardDeviation": {
        "total": "11720",
        "ok": "18666",
        "ko": "11108"
    },
    "percentiles1": {
        "total": "2377",
        "ok": "10048",
        "ko": "2347"
    },
    "percentiles2": {
        "total": "4011",
        "ok": "35164",
        "ko": "3833"
    },
    "percentiles3": {
        "total": "38054",
        "ok": "55455",
        "ko": "33219"
    },
    "percentiles4": {
        "total": "60004",
        "ok": "59024",
        "ko": "60004"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 109,
    "percentage": 1
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 3,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 444,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 14474,
    "percentage": 96
},
    "meanNumberOfRequestsPerSecond": {
        "total": "125.25",
        "ok": "4.633",
        "ko": "120.617"
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
        "ok": "2636",
        "ko": "12394"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "14249",
        "ok": "14249",
        "ko": "10044"
    },
    "meanResponseTime": {
        "total": "2867",
        "ok": "1765",
        "ko": "3101"
    },
    "standardDeviation": {
        "total": "1816",
        "ok": "2932",
        "ko": "1363"
    },
    "percentiles1": {
        "total": "2388",
        "ok": "133",
        "ko": "2595"
    },
    "percentiles2": {
        "total": "3583",
        "ok": "2570",
        "ko": "3601"
    },
    "percentiles3": {
        "total": "6746",
        "ok": "8636",
        "ko": "6189"
    },
    "percentiles4": {
        "total": "8746",
        "ok": "10760",
        "ko": "7837"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1789,
    "percentage": 12
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 50,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 797,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 12394,
    "percentage": 82
},
    "meanNumberOfRequestsPerSecond": {
        "total": "125.25",
        "ok": "21.967",
        "ko": "103.283"
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
