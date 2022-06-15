var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "2061",
        "ko": "999"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "17640",
        "ok": "17640",
        "ko": "17416"
    },
    "meanResponseTime": {
        "total": "452",
        "ok": "321",
        "ko": "723"
    },
    "standardDeviation": {
        "total": "1618",
        "ok": "1100",
        "ko": "2327"
    },
    "percentiles1": {
        "total": "29",
        "ok": "4",
        "ko": "33"
    },
    "percentiles2": {
        "total": "43",
        "ok": "39",
        "ko": "49"
    },
    "percentiles3": {
        "total": "3290",
        "ok": "2613",
        "ko": "4037"
    },
    "percentiles4": {
        "total": "4542",
        "ok": "4259",
        "ko": "17160"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1874,
    "percentage": 61
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 5,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 182,
    "percentage": 6
},
    "group4": {
    "name": "failed",
    "count": 999,
    "percentage": 33
},
    "meanNumberOfRequestsPerSecond": {
        "total": "37.778",
        "ok": "25.444",
        "ko": "12.333"
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
        "ok": "531",
        "ko": "999"
    },
    "minResponseTime": {
        "total": "27",
        "ok": "27",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "17640",
        "ok": "17640",
        "ko": "17416"
    },
    "meanResponseTime": {
        "total": "859",
        "ok": "1114",
        "ko": "723"
    },
    "standardDeviation": {
        "total": "2210",
        "ok": "1945",
        "ko": "2327"
    },
    "percentiles1": {
        "total": "34",
        "ok": "39",
        "ko": "33"
    },
    "percentiles2": {
        "total": "413",
        "ok": "2036",
        "ko": "49"
    },
    "percentiles3": {
        "total": "4105",
        "ok": "4157",
        "ko": "4037"
    },
    "percentiles4": {
        "total": "16565",
        "ok": "4458",
        "ko": "17160"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 349,
    "percentage": 23
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 2,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 180,
    "percentage": 12
},
    "group4": {
    "name": "failed",
    "count": 999,
    "percentage": 65
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.889",
        "ok": "6.556",
        "ko": "12.333"
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
        "total": "2205",
        "ok": "2205",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "46",
        "ok": "46",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "150",
        "ok": "150",
        "ko": "-"
    },
    "percentiles1": {
        "total": "2",
        "ok": "2",
        "ko": "-"
    },
    "percentiles2": {
        "total": "11",
        "ok": "12",
        "ko": "-"
    },
    "percentiles3": {
        "total": "278",
        "ok": "278",
        "ko": "-"
    },
    "percentiles4": {
        "total": "732",
        "ok": "732",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1525,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 3,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 2,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.889",
        "ok": "18.889",
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
