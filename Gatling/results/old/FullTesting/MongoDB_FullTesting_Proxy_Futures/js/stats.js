var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10670",
        "ok": "7149",
        "ko": "3521"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "32792",
        "ok": "32792",
        "ko": "32007"
    },
    "meanResponseTime": {
        "total": "1437",
        "ok": "1211",
        "ko": "1895"
    },
    "standardDeviation": {
        "total": "3176",
        "ok": "3693",
        "ko": "1602"
    },
    "percentiles1": {
        "total": "509",
        "ok": "18",
        "ko": "2047"
    },
    "percentiles2": {
        "total": "2048",
        "ok": "968",
        "ko": "2151"
    },
    "percentiles3": {
        "total": "4005",
        "ok": "4878",
        "ko": "3175"
    },
    "percentiles4": {
        "total": "15316",
        "ok": "27271",
        "ko": "8327"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 5046,
    "percentage": 47
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 530,
    "percentage": 5
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1573,
    "percentage": 15
},
    "group4": {
    "name": "failed",
    "count": 3521,
    "percentage": 33
},
    "meanNumberOfRequestsPerSecond": {
        "total": "38.244",
        "ok": "25.624",
        "ko": "12.62"
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
        "total": "5335",
        "ok": "2310",
        "ko": "3025"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "12",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "32792",
        "ok": "32792",
        "ko": "32007"
    },
    "meanResponseTime": {
        "total": "2242",
        "ok": "2725",
        "ko": "1873"
    },
    "standardDeviation": {
        "total": "4151",
        "ok": "5956",
        "ko": "1727"
    },
    "percentiles1": {
        "total": "2032",
        "ok": "545",
        "ko": "2058"
    },
    "percentiles2": {
        "total": "2210",
        "ok": "2741",
        "ko": "2171"
    },
    "percentiles3": {
        "total": "7487",
        "ok": "9201",
        "ko": "3798"
    },
    "percentiles4": {
        "total": "28461",
        "ok": "31231",
        "ko": "8366"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1232,
    "percentage": 23
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 83,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 995,
    "percentage": 19
},
    "group4": {
    "name": "failed",
    "count": 3025,
    "percentage": 57
},
    "meanNumberOfRequestsPerSecond": {
        "total": "19.122",
        "ok": "8.28",
        "ko": "10.842"
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
        "total": "5335",
        "ok": "4839",
        "ko": "496"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2000"
    },
    "maxResponseTime": {
        "total": "26853",
        "ok": "26853",
        "ko": "2078"
    },
    "meanResponseTime": {
        "total": "632",
        "ok": "488",
        "ko": "2030"
    },
    "standardDeviation": {
        "total": "1286",
        "ok": "1266",
        "ko": "14"
    },
    "percentiles1": {
        "total": "18",
        "ok": "6",
        "ko": "2032"
    },
    "percentiles2": {
        "total": "917",
        "ok": "554",
        "ko": "2035"
    },
    "percentiles3": {
        "total": "2093",
        "ok": "2119",
        "ko": "2049"
    },
    "percentiles4": {
        "total": "5740",
        "ok": "6012",
        "ko": "2063"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 3814,
    "percentage": 71
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 447,
    "percentage": 8
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 578,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "count": 496,
    "percentage": 9
},
    "meanNumberOfRequestsPerSecond": {
        "total": "19.122",
        "ok": "17.344",
        "ko": "1.778"
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
