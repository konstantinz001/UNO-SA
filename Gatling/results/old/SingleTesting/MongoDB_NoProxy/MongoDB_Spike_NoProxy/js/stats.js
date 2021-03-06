var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2000",
        "ok": "1002",
        "ko": "998"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "339"
    },
    "maxResponseTime": {
        "total": "5096",
        "ok": "5096",
        "ko": "4113"
    },
    "meanResponseTime": {
        "total": "1225",
        "ok": "424",
        "ko": "2030"
    },
    "standardDeviation": {
        "total": "1005",
        "ok": "465",
        "ko": "716"
    },
    "percentiles1": {
        "total": "1070",
        "ok": "155",
        "ko": "2165"
    },
    "percentiles2": {
        "total": "2166",
        "ok": "682",
        "ko": "2327"
    },
    "percentiles3": {
        "total": "2955",
        "ok": "1092",
        "ko": "3070"
    },
    "percentiles4": {
        "total": "3227",
        "ok": "1125",
        "ko": "3970"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 807,
    "percentage": 40
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 190,
    "percentage": 10
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 5,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 998,
    "percentage": 50
},
    "meanNumberOfRequestsPerSecond": {
        "total": "222.222",
        "ok": "111.333",
        "ko": "110.889"
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
        "total": "1000",
        "ok": "2",
        "ko": "998"
    },
    "minResponseTime": {
        "total": "339",
        "ok": "4982",
        "ko": "339"
    },
    "maxResponseTime": {
        "total": "5096",
        "ok": "5096",
        "ko": "4113"
    },
    "meanResponseTime": {
        "total": "2036",
        "ok": "5039",
        "ko": "2030"
    },
    "standardDeviation": {
        "total": "728",
        "ok": "57",
        "ko": "716"
    },
    "percentiles1": {
        "total": "2166",
        "ok": "5039",
        "ko": "2165"
    },
    "percentiles2": {
        "total": "2328",
        "ok": "5068",
        "ko": "2327"
    },
    "percentiles3": {
        "total": "3075",
        "ok": "5090",
        "ko": "3070"
    },
    "percentiles4": {
        "total": "3974",
        "ok": "5095",
        "ko": "3970"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 998,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "111.111",
        "ok": "0.222",
        "ko": "110.889"
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
        "total": "1000",
        "ok": "1000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1555",
        "ok": "1555",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "415",
        "ok": "415",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "417",
        "ok": "417",
        "ko": "-"
    },
    "percentiles1": {
        "total": "152",
        "ok": "152",
        "ko": "-"
    },
    "percentiles2": {
        "total": "680",
        "ok": "680",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1090",
        "ok": "1090",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1111",
        "ok": "1111",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 807,
    "percentage": 81
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 190,
    "percentage": 19
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 3,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "111.111",
        "ok": "111.111",
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
